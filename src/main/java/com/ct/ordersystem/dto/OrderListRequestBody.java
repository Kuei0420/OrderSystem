package com.ct.ordersystem.dto;

import lombok.Data;

@Data
public class OrderListRequestBody {

	private int orderListId;
	
	private String tableNum;

	private String menuName;

	private int price;

	private int status;
}
