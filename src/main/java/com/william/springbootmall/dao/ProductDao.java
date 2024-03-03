package com.william.springbootmall.dao;

import com.william.springbootmall.constant.ProductCategory;
import com.william.springbootmall.dao.dto.ProductRequest;
import com.william.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {

    List<Product> getProducts(ProductCategory category, String search);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
