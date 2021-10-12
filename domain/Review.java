package com.onlinefurniture.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.onlinefurniture.domain.stock.Product;
import com.onlinefurniture.domain.stock.ProductApprovedStatus;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @Digits(integer = 1,fraction = 2,message = "Stars Not Valid")
    private double stars;

    public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



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



	@NotEmpty
    @NotBlank
    private String comment;

    @ManyToOne
    private Product product;



    private String status= ProductApprovedStatus.PENDING.getProductStatus();

}
