package com.onlinefurniture.domain;

public enum CardTypes {
    Visa("Visa"),
    MasterCard("MasterCard"),
    Discoverer("Discoverer");

    public void setCardType(String cardType) {
		CardType = cardType;
	}

	private String CardType;

    CardTypes(String status){this.CardType=status;}

    public String getCardType(){
        return this.CardType;
    }
}
