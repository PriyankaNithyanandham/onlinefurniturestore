package com.onlinefurniture.service;

import org.springframework.data.repository.query.Param;

import com.onlinefurniture.domain.Address;
import com.onlinefurniture.domain.Order;
import com.onlinefurniture.domain.Seller;
import com.onlinefurniture.domain.stock.Product;

import java.util.List;


public interface SellerService {
    public Seller getSellerBySId(long id);
    public Seller getSellerByUserName(String userName);
    public List<Long> getOrderIdsBySellerBySId(long sId);

    public Seller makeItApprovedOrRejected(String userName, String status);
    public List<Order> getOrdersBySellerBySId( long sId);

    public List<Seller> getAllSellers();

    public void addSeller(Seller seller);

    public void save(Seller seller);

    public Order shipSellerOrder(String userName, long oId);

    public Order cancelSellerOrder(String userName, long oId);

    public Order getOrderByIdForSeller(String userName, long oId);
}
