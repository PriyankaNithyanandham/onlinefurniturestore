package com.onlinefurniture.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.Valid;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity (name="ord")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public LocalDate getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(LocalDate createdOn) {
		this.createdOn = createdOn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public List<LineItem> getLineItems() {
		return lineItems;
	}

	public void setLineItems(List<LineItem> lineItems) {
		this.lineItems = lineItems;
	}

	public Boolean getOrderPaid() {
		return orderPaid;
	}

	public void setOrderPaid(Boolean orderPaid) {
		this.orderPaid = orderPaid;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Buyer getBuyer() {
		return buyer;
	}

	public void setBuyer(Buyer buyer) {
		this.buyer = buyer;
	}

	private LocalDate createdOn=LocalDate.now();

    private double price;

    @Valid
    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable
    List<LineItem> lineItems=new ArrayList<>();

    Boolean orderPaid=false;

    String orderStatus=OrderStatus.Pending.getOrderStatus();
    @ManyToOne
    @JsonIgnore
    private Buyer buyer;

    @Override
    public String toString() {
        return "Your Order : " +
                "\n\tid : " + id +
                "\n\tcreatedOn : " + createdOn +
                "\n\tprice : " + price +
                "\n\t"+ lineItems +
                "\n\torderStatus : '" + orderStatus;
    }
}
