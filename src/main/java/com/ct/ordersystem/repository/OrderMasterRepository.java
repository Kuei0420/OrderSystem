package com.ct.ordersystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ct.ordersystem.entity.OrderMasterEntity;

@Repository
public interface OrderMasterRepository extends JpaRepository<OrderMasterEntity, Integer>{

}
