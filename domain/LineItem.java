package com.onlinefurniture.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.Valid;

import com.onlinefurniture.domain.stock.Product;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class LineItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    private int quantity;
    private double price;

    public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

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

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	//@OneToOne(cascade = CascadeType.ALL)
    @Valid
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "product_id")
    private Product product;

    @Override
    public String toString() {
        return "quantity : " + quantity +
                "\n\t price : " + price +
                "\n\t product : " + product;
    }
}
