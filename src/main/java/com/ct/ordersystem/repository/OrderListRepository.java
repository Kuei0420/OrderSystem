package com.ct.ordersystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ct.ordersystem.entity.OrderListEntity;

@Repository
public interface OrderListRepository extends JpaRepository<OrderListEntity, Integer>{

}
