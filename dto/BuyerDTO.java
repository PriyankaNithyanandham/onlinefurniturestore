package com.onlinefurniture.dto;

import lombok.Getter;
import lombok.Setter;
import java.util.List;

import com.onlinefurniture.domain.*;

@Getter
@Setter
public class BuyerDTO {

    long points;
    List<Order> orders;
    User user;
    public long getPoints() {
		return points;
	}
	public void setPoints(long points) {
		this.points = points;
	}
	public List<Order> getOrders() {
		return orders;
	}
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Address getShippingAddress() {
		return shippingAddress;
	}
	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	public Address getBillingAddress() {
		return billingAddress;
	}
	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}
	public List<PaymentMethod> getPaymentMethods() {
		return paymentMethods;
	}
	public void setPaymentMethods(List<PaymentMethod> paymentMethods) {
		this.paymentMethods = paymentMethods;
	}
	public List<Seller> getSellersFollowed() {
		return sellersFollowed;
	}
	public void setSellersFollowed(List<Seller> sellersFollowed) {
		this.sellersFollowed = sellersFollowed;
	}
	Address shippingAddress;
    Address billingAddress;
    List<PaymentMethod> paymentMethods;
    List<Seller> sellersFollowed;


}
