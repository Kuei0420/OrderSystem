package com.ct.ordersystem.dto;

import lombok.Data;

@Data
public class MenuRequestBody {
	private Integer menuId;

	private String menuName;

	private String description;

	private String price;
}
