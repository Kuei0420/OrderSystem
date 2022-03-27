package com.ct.ordersystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ct.ordersystem.entity.OrderCust;

public interface OrderCustRepository extends JpaRepository<OrderCust, Integer>{

}
