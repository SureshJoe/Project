package com.niitproject.DAO;

import java.util.List;

import com.niitproject.Sections.OrderDetail;

public interface OrderDetailDAO {
	public boolean confirmOrder(OrderDetail orderDetail);
    public List<OrderDetail> getOrderDetail(String username);
    public OrderDetail getOrderId(int OrderId);
}

