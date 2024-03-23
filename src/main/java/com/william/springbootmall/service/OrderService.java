package com.william.springbootmall.service;

import com.william.springbootmall.dto.CreateOrderRequest;
import com.william.springbootmall.model.Order;

public interface OrderService {
    Order getOrderById(Integer orderId);


    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);

}
