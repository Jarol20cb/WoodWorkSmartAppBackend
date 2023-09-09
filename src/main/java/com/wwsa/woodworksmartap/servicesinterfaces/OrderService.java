package com.wwsa.woodworksmartap.servicesinterfaces;

import com.wwsa.woodworksmartap.entities.Order;

import java.util.List;

public interface OrderService {
    public void insert(Order order);
    public List<Order> list();
    public void delete(int idOrder);
    public Order listId(int idOrder);
}
