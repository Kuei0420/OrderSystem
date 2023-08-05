package com.ct.ordersystem.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ct.ordersystem.repository.OrderMasterRepository;
import com.ct.ordersystem.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	OrderMasterRepository orderCustRepo;



}
