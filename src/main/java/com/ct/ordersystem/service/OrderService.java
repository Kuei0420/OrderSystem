package com.ct.ordersystem.service;

import java.util.List;

import com.ct.ordersystem.dto.OrderCustRequestBody;
import com.ct.ordersystem.dto.OrderListRequestBody;
import com.ct.ordersystem.entity.OrderCust;
import com.ct.ordersystem.entity.OrderList;

public interface OrderService {

	OrderCust addOrderCust(OrderCustRequestBody orderCustRequestBody);

	List<OrderCust> findAllOrderCust();
	
	Object findOrderCustById(int orderCustId);

	void deleteOrderCust(int orderCustId);

	OrderCust updateOrderCust(OrderCustRequestBody orderCustRequestBody);

	
	
	OrderList addOrderList(OrderListRequestBody orderListRequestBody);

	List<OrderList> findAllOrderList();

	Object findOrderListById(int orderListId);

	void deleteOrderList(int orderListId);

	OrderList updateOrderList(OrderListRequestBody orderListRequestBody);
}
