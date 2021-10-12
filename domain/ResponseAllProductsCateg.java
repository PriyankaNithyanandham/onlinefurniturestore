package com.onlinefurniture.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

import com.onlinefurniture.domain.stock.Product;

@Getter
@Setter
public class ResponseAllProductsCateg extends Response{

    public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	private List<Product> products;
}
