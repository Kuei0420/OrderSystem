package com.ct.ordersystem.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Data
@Entity(name = "order_master")
public class OrderMasterEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ORDERSEQ")
	@SequenceGenerator(name = "ORDERSEQ", sequenceName = "ORDERSEQ", allocationSize = 1)
	@Column(name = "order_master_id")
	private Integer orderMaseterId;

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
