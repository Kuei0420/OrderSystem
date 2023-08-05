package com.ct.ordersystem.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Data
@Entity(name = "order_list")
public class OrderListEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "order_list_id")
	private Integer orderListId;
	
	@Column(name = "order_id")
	private String orderId;

	@Column(name = "menu_id")
	private String menuId;

	@Column(name = "menu_name")
	private String menuName;

	@Column(name = "count")
	private String count;
	@Column(name = "table_num")
	private String tableNum;


	@Column(name = "total_price")
	private String totalPrice;

	@Column(name = "status")
	private String status;
	
	@Column(name = "create_time") 
	@CreationTimestamp
	private Date createTime;

	@Column(name = "update_time")
	@UpdateTimestamp
	private Date updateTime;


}
