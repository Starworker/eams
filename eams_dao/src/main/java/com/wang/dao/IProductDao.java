package com.wang.dao;

import com.wang.domain.Product;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Repository
public interface IProductDao {
    /**
     * 持久层，查询所有商品
     * @return
     */
    @Select(value = "select * from product")
    public List<Product> findAll();
}
