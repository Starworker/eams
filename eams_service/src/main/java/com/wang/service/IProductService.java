package com.wang.service;

import com.wang.domain.Product;

import java.util.List;

public interface IProductService {

    /**
     * 持久层，查询所有商品
     * @return
     */
    public List<Product> findAll();
}
