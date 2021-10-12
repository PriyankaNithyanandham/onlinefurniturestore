package com.onlinefurniture.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

import com.onlinefurniture.domain.LineItem;
@Getter
@Setter
public class OrderDTO {
    private Date createdOn;
    private double price;
    public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public List<LineItemDTO> getLineItemsDTO() {
		return lineItemsDTO;
	}
	public void setLineItemsDTO(List<LineItemDTO> lineItemsDTO) {
		this.lineItemsDTO = lineItemsDTO;
	}
	List<LineItemDTO> lineItemsDTO;

}
