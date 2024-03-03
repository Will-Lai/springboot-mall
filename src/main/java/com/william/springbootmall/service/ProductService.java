package com.william.springbootmall.service;

import com.william.springbootmall.dao.dto.ProductRequest;
import com.william.springbootmall.model.Product;

public interface ProductService {
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
