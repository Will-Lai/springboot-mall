package com.william.springbootmall.service;

import com.william.springbootmall.dto.CreateOrderRequest;
import com.william.springbootmall.dto.OrderQueryParams;
import com.william.springbootmall.model.Order;

import java.util.List;

public interface OrderService {
    Order getOrderById(Integer orderId);


    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);

    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

}
