package com.ct.ordersystem.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ct.ordersystem.common.utils.CommonUtils;
import com.ct.ordersystem.dto.OrderCustRequestBody;
import com.ct.ordersystem.dto.OrderListRequestBody;
import com.ct.ordersystem.entity.Menu;
import com.ct.ordersystem.entity.OrderCust;
import com.ct.ordersystem.entity.OrderList;
import com.ct.ordersystem.repository.OrderCustRepository;
import com.ct.ordersystem.repository.OrderListRepository;
import com.ct.ordersystem.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	OrderCustRepository orderCustRepo;

	@Autowired
	OrderListRepository orderListRepo;

	@Override
	public OrderCust addOrderCust(OrderCustRequestBody orderCustRequestBody) {
		CommonUtils commonUtils = new CommonUtils();
		OrderCust ordercust = new OrderCust();
		commonUtils.copyNonNullProperties(orderCustRequestBody, ordercust);
		return orderCustRepo.save(ordercust);
	}

	@Override
	public List<OrderCust> findAllOrderCust() {
		return orderCustRepo.findAll();
	}

	@Override
	public Object findOrderCustById(int orderCustId) {
		return orderCustRepo.findById(orderCustId);
	}

	@Override
	public void deleteOrderCust(int orderCustId) {
		orderCustRepo.deleteById(orderCustId);

	}

	@Override
	public OrderCust updateOrderCust(OrderCustRequestBody orderCustRequestBody) {
		Optional<OrderCust> orderCustTmp = orderCustRepo.findById(orderCustRequestBody.getOrderCustId());
		CommonUtils commonUtils = new CommonUtils();
		commonUtils.copyNonNullProperties(orderCustRequestBody, orderCustTmp.get());
		return orderCustRepo.save(orderCustTmp.get());
	}

	@Override
	public OrderList addOrderList(OrderListRequestBody orderListRequestBody) {
		CommonUtils commonUtils = new CommonUtils();
		OrderList orderlist = new OrderList();
		commonUtils.copyNonNullProperties(orderListRequestBody, orderlist);
		return orderListRepo.save(orderlist);

	}

	@Override
	public List<OrderList> findAllOrderList() {

		return orderListRepo.findAll();
	}

	@Override
	public Object findOrderListById(int orderListId) {
		return orderListRepo.findById(orderListId);
	}

	@Override
	public void deleteOrderList(int orderListId) {
		orderListRepo.deleteById(orderListId);

	}

	@Override
	public OrderList updateOrderList(OrderListRequestBody orderListRequestBody) {

		Optional<OrderList> orderListTmp = orderListRepo.findById(orderListRequestBody.getOrderListId());
		CommonUtils commonUtils = new CommonUtils();
		commonUtils.copyNonNullProperties(orderListRequestBody, orderListTmp.get());
		return orderListRepo.save(orderListTmp.get());
	}

}
