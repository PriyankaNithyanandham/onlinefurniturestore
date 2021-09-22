package com.service;

import com.entity.Furniture;
import com.entity.Order;

public interface OrderCancellationService {
	String deleteOrder(Order order);
	String deleteOrderById(int orderId);

}
