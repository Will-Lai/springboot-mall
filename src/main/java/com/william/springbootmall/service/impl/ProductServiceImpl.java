package com.william.springbootmall.service.impl;

import com.william.springbootmall.dao.ProductDao;
import com.william.springbootmall.dao.dto.ProductRequest;
import com.william.springbootmall.model.Product;
import com.william.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;
    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }

    @Override
    public Integer createProduct(ProductRequest productRequest) {
        return productDao.createProduct(productRequest);
    }
}
