package com.william.springbootmall.dao;

import com.william.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}
