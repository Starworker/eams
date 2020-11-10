package com.wang.controller;

import com.wang.domain.Product;
import com.wang.service.Impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductServiceImpl productService;

    @RequestMapping("/findAll")
    public ModelAndView findAll(){
        List<Product> products = productService.findAll();
        ModelAndView mv = new ModelAndView();
        mv.addObject("productList",products);
        mv.setViewName("product-list");
        return mv;
    }
}
