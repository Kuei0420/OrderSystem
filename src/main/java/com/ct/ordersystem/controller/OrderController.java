package com.ct.ordersystem.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ct.ordersystem.dto.OrderCustRequestBody;
import com.ct.ordersystem.dto.OrderListRequestBody;
import com.ct.ordersystem.entity.OrderCust;
import com.ct.ordersystem.entity.OrderList;
import com.ct.ordersystem.service.OrderService;

@RestController
public class OrderController {

	private static Logger logger = LoggerFactory.getLogger(OrderController.class);

	@Autowired
	OrderService orderService;
	
	@PostMapping("/findAllOrder")
	@ResponseBody
	public List<OrderCust> findAllOrder(Model model) {
		
		List<OrderCust> orderCustList =orderService.findAllOrderCust();
		return orderCustList;
	}
	
	@PostMapping(value = "/addOrderCust", produces = MediaType.APPLICATION_JSON_VALUE)
	public OrderCust addOrderCust(@RequestBody OrderCustRequestBody orderCustRequestBody) {
		logger.info("orderCustRequestBody:{}",orderCustRequestBody);
		return orderService.addOrderCust(orderCustRequestBody);

	}

	@PostMapping(value = "/findAllOrderCust", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<OrderCust> findAllOrderCust() {
		return orderService.findAllOrderCust();
	}

	@PostMapping(value = "/findOrderCust", produces = MediaType.APPLICATION_JSON_VALUE)
	public Object findOrderCust(OrderCustRequestBody orderCustRequestBody) {
		return orderService.findOrderCustById(orderCustRequestBody.getOrderCustId());
	}

	@PostMapping(value = "/updateOrderCust", produces = MediaType.APPLICATION_JSON_VALUE)
	public OrderCust updateOrderCust(@RequestBody OrderCustRequestBody orderCustRequestBody) {
		return orderService.updateOrderCust(orderCustRequestBody);

	}

	@PostMapping(value = "/deleteOrderCust", produces = MediaType.APPLICATION_JSON_VALUE)
	public String deleteOrderCust(@RequestBody OrderCustRequestBody orderCustRequestBody) {
		orderService.deleteOrderCust(orderCustRequestBody.getOrderCustId());

		return "OrderCust Delete!";
	}

	@PostMapping(value = "/addOrderList", produces = MediaType.APPLICATION_JSON_VALUE)
	public OrderListRequestBody addOrderList(@RequestBody OrderListRequestBody orderListRequestBody) {

		orderService.addOrderList(orderListRequestBody);

		return orderListRequestBody;
	}

	@PostMapping(value = "/findAllOrderList", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<OrderList> findAllOrderList() {
		return orderService.findAllOrderList();
	}

	@PostMapping(value = "/findOrderList", produces = MediaType.APPLICATION_JSON_VALUE)
	public Object findOrderList(OrderListRequestBody orderListRequestBody) {
		return orderService.findOrderListById(orderListRequestBody.getOrderListId());
	}

	@PostMapping(value = "/updateOrderList", produces = MediaType.APPLICATION_JSON_VALUE)
	public OrderList updateOrderList(@RequestBody OrderListRequestBody orderListRequestBody) {
		return orderService.updateOrderList(orderListRequestBody);

	}

	@PostMapping(value = "/deleteOrderList", produces = MediaType.APPLICATION_JSON_VALUE)
	public String deleteOrderList(@RequestBody OrderListRequestBody orderListRequestBody) {
		orderService.deleteOrderList(orderListRequestBody.getOrderListId());

		return "OrderList Delete!";
	}
}
