package com.service;

import java.util.List;

import com.entity.Order;

public interface OrderService {
	
	List<Order> getAllOrders();
	Order getOrderByStatus(String status);
	Order updateOrder(Order order);
	Order updateOrderById(int orderId);
}
