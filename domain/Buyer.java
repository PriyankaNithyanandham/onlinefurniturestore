package com.onlinefurniture.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.Digits;
import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Buyer {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long bId;

    public long getbId() {
		return bId;
	}

	public void setbId(long bId) {
		this.bId = bId;
	}

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

	public List<Seller> getSellersFollowed() {
		return sellersFollowed;
	}

	public void setSellersFollowed(List<Seller> sellersFollowed) {
		this.sellersFollowed = sellersFollowed;
	}

	public CreditCard getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
	}

	@Digits(integer = 6, fraction = 0)
    long points=0;


    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable
    @Fetch(FetchMode.JOIN)

    private List<Order> orders;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="User_ID")
    private User user;

    @Valid
    @OneToOne(cascade = CascadeType.ALL)
    private Address shippingAddress=new Address();

    @Valid
    @OneToOne(cascade = CascadeType.ALL)
    private Address billingAddress=new Address();

    @Valid
    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable
    private List<Seller> sellersFollowed=new ArrayList<>();

    @Valid
    @OneToOne(cascade = CascadeType.ALL)
    private CreditCard creditCard=new CreditCard();


}