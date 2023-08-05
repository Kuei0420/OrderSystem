package com.ct.ordersystem.dto;

import lombok.Data;

@Data
public class OrderRequestBody {

	private Integer orderId;

	private String tableNum;

	private String totalPrice;

	private String status;

}
