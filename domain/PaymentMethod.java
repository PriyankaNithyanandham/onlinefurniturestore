package com.onlinefurniture.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import javax.validation.constraints.Pattern;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class PaymentMethod {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    @Pattern(regexp = "[0-9]{16}")
    String cardNumber;

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

	public String getCardExpiryDate() {
		return cardExpiryDate;
	}

	public void setCardExpiryDate(String cardExpiryDate) {
		this.cardExpiryDate = cardExpiryDate;
	}

	public CardTypes getCardType() {
		return cardType;
	}

	public void setCardType(CardTypes cardType) {
		this.cardType = cardType;
	}

	@Pattern(regexp = "(0[1-9]|1[0-2])\\/?([0-9]{4}|[0-9]{2})",message = "{card.expiration}")
    String cardExpiryDate;

    CardTypes cardType;


}
