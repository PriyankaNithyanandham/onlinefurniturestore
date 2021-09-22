package com.service;

import java.util.List;

import com.entity.Cart;

public interface ShopingCartService {
	
	List<Cart> getAllCarts();
	Cart getCartById(int cartId);
	Cart updateCart(Cart cart);
	Cart updateCartById(int cartId);
	String deleteCart(Cart cart);
	String deleteCartById(int cartId);

}
