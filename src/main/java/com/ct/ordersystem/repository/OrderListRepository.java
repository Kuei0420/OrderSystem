package com.ct.ordersystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ct.ordersystem.entity.OrderList;

public interface OrderListRepository extends JpaRepository<OrderList, Integer>{

}
