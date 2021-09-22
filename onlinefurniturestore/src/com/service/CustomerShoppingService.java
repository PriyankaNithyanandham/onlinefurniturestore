package com.service;

import java.util.List;

import com.entity.Cart;
import com.entity.Furniture;
import com.entity.Order;

public interface CustomerShoppingService {
	
	List<Furniture> getAllFurnitures();
	Furniture getFurnitureByName(String furnitureName);

	Cart addtoCart(Furniture furniture);
	
	Order placeOrder(Order order);

}
