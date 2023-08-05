package com.ct.ordersystem.dto;

import lombok.Data;

@Data
public class OrderListRequestBody {

	private Integer orderListId;
	
	private String orderId;

	private String menuId;

	private String menuName;

	private String count;
	
	private String tableNum;

	private String totalPrice;

	private String status;
}
