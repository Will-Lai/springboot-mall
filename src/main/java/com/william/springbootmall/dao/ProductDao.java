package com.william.springbootmall.dao;

import com.william.springbootmall.dao.dto.ProductRequest;
import com.william.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
