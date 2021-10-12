package com.onlinefurniture.dto;

import com.onlinefurniture.domain.stock.Product;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ReviewDTO {

    private double stars;
    private String comment;
    public double getStars() {
		return stars;
	}
	public void setStars(double stars) {
		this.stars = stars;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	private Product product;
    private String status;
}
