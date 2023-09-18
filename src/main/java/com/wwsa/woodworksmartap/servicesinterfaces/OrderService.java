package com.wwsa.woodworksmartap.servicesinterfaces;

import com.wwsa.woodworksmartap.entities.Order;
import com.wwsa.woodworksmartap.entities.PaymentType;

import java.util.List;

public interface OrderService {

    public void insert(Order order);
    public List<Order> list();
    public void delete(int OrderId);
    public Order listId(int OrderId);
}
