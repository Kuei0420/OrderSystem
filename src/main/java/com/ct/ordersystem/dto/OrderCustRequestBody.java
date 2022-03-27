package com.ct.ordersystem.dto;

import lombok.Data;

@Data
public class OrderCustRequestBody {

	private int orderCustId;

	private String tableNum;

	private int count;

	private int totalPrice;
	
	private int status;
}
