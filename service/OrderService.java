package com.onlinefurniture.service;

import org.springframework.web.bind.annotation.PathVariable;

import com.onlinefurniture.domain.Buyer;
import com.onlinefurniture.domain.LineItem;
import com.onlinefurniture.domain.Order;
import com.onlinefurniture.domain.OrderStatus;

import java.util.List;
import java.util.stream.Collectors;

public interface OrderService {
    public List<LineItem> getOrderLineItemsByOrderId(long id);
    public Order getOrderById(long id);

    public void save(Order order);
    public Order deliveredOrder(String userName,long oId);
}
