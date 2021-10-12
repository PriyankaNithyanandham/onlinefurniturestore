package com.onlinefurniture.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import com.onlinefurniture.domain.stock.Product;

@Getter
@Setter
public class LineItemDTO {

    private int quantity;
    private double price;

    public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	private long productId;
}
