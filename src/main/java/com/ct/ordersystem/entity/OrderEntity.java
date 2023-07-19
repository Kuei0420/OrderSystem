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
@Entity(name = "order_cust")
public class OrderCust {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "order_cust_id")
	private int orderCustId;

	@Column(name = "table_num")
	private int tableNum;

	@Column(name = "count")
	private String count;

	@Column(name = "total_price")
	private int totalPrice;

	@Column(name = "status")
	private int status;

	@Column(name = "create_time") 
	@CreationTimestamp
	private Date createTime;

	@Column(name = "update_time")
	@UpdateTimestamp
	private Date updateTime;


}
