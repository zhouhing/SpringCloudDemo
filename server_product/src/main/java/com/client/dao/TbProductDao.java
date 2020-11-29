package com.client.dao;

import com.serverProduct.entity.TbProduct;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface TbProductDao {
    int deleteByPrimaryKey(Integer id);

    int insert(TbProduct record);

    int insertSelective(TbProduct record);

    TbProduct selectByPrimaryKey(Integer id);

    /**
     * 分页查询数据
     * @param pageIndex 当前页码
     * @param pageLimit 每页的限制数量
     * @return
     */
    List<TbProduct> selectAll(int pageIndex,int pageLimit);

    int updateByPrimaryKeySelective(TbProduct record);

    int updateByPrimaryKey(TbProduct record);
}