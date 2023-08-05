package com.ct.ordersystem.entity;

import java.util.Date;

import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import lombok.Data;

@Data
@Entity(name = "menu")
public class MenuEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "menu_id")
	private Integer menuId;

	@Column(name = "menu_name")
	private String menuName;

	@Column(name = "description")
	private String description;

	@Column(name = "price")
	private String price;

	@Column(name = "create_time")
	@CreationTimestamp
	private Date createTime;

	@Column(name = "update_time")
	@UpdateTimestamp
	private Date updateTime;

}
