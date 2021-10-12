package com.onlinefurniture.domain;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.onlinefurniture.domain.stock.Product;
import com.onlinefurniture.domain.stock.ProductApprovedStatus;
import com.onlinefurniture.domain.stock.Stock;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import javax.validation.Valid;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Seller {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long sId;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="User_ID")
    User user;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable
    @JsonIgnore
    List<Product> products;

    public long getsId() {
		return sId;
	}

	public void setsId(long sId) {
		this.sId = sId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	private String status= ProductApprovedStatus.PENDING.getProductStatus();

}
