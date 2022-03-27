package com.ct.ordersystem.dto;

import lombok.Data;

@Data
public class MenuRequestBody {
	private int menuId;

	private String menuName;

	private String description;

	private int price;
}
