package com.ct.ordersystem.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import lombok.Data;

@Data
@Entity(name = "oreder_list")
public class OrderList {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "order_list_id")
	private int orderListId;

	@Column(name = "table_num")
	private String tableNum;

	@Column(name = "menu_name")
	private String menuName;

	@Column(name = "price")
	private int price;

	@Column(name = "status")
	private int status;
	
	@Column(name = "create_time") 
	@CreationTimestamp
	private Date createTime;

	@Column(name = "update_time")
	@UpdateTimestamp
	private Date updateTime;


}
