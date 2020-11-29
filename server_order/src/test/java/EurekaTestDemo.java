import com.client.Client02SpringApplication;
import com.client.controller.ProductController;
import com.client.controller.OrderController;
import com.client.entity.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author ZYH
 * @version 5.0.0
 * created at 2020/11/26 23:19
 * copyright @2020 Beijing Murong Information Technology Co., Ltd.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {Client02SpringApplication.class})
public class EurekaTestDemo {

    @Autowired
    private OrderController orderController;
    @Autowired
    private ProductController demoController;

    @Autowired
    private DiscoveryClient discoveryClient;

    @Test
    public void DisTest() {
        List<String> services = discoveryClient.getServices();
        for (String service : services) {
            System.out.println("发现了什么：" + service);
            for (ServiceInstance instance : discoveryClient.getInstances(service)) {
                System.out.println(instance.getHost() + ":" + instance.getPort() + " "
                        + instance.getUri() + " " + instance.getInstanceId() + " "
                        + instance.getServiceId() + " " + instance.getMetadata()+" "+
                        instance.getScheme());
            }
        }
    }

    @Test
    public void testRestTemplate() {
        String order = orderController.order();
        System.out.println(order);
        Product product = demoController.findProduct();
        System.out.println(product);
    }

    @Test
    public void testRibbon() {
        String order = orderController.order1();
        System.out.println(order);
        Product product = demoController.findProduct();
        System.out.println(product);
    }
}
