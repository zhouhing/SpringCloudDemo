# 本人学习小项目
+ SpringCloud learning Demo 
# 微服务提供端
+ server_order
+ server_product
+ server_user
+ server_user_hystrix  
 `添加了服务熔断器，保证服务的容错率` 
# 微服务消费端（调用使用端）
- client_FeignConsumer  
`使用Feign（接口注解）的方式负载均衡的调用微服务`
- client_hystrix_dashboard  
`这是一个微服务监控的配置端，可以监控服务的健康状态`
- client_RibbonConsumer  
`使用Ribbon的方式，负载均衡的调用微服务`
# 微服务注册中心（Eureka）
+ eureka_server01
+ eureka_server02
+ eureka_server03

三个注册中心都一样，三个服务中心，协助搭建起一个服务中心集群，可以互相调用自己拥有的微服务
# 微服务Zuul网关
+ SpringCloudZuul

使用网关可以隐蔽所有为微服务相关的真是信息，用户端可以只通过网关就能调用到注册中心中的任何微服务

# 微服务完整结构
![微服务整体架构](https://spring.io/images/diagram-microservices-88e01c7d34c688cb49556435c130d352.svg)