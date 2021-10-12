package com.onlinefurniture.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Pattern;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class CreditCard {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    long id;

    public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	public String getExpDate() {
		return expDate;
	}

	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}

	@Pattern(regexp = "[0-9]{4}-[0-9]{4}-[0-9]{4}-[0-9]{4}",message = "CardNumber InValid")
    String cardNumber;

    @Pattern(regexp = "[0-9]{3}",message = "Card CVV InValid")
    String cvv;

    @Pattern(regexp = "[0-9]{2}-[0-9]{2}",message = "Card ExpDate InValid")
    String expDate;



}