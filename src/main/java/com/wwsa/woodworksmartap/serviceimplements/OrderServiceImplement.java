package com.wwsa.woodworksmartap.serviceimplements;

import com.wwsa.woodworksmartap.entities.Order;
import com.wwsa.woodworksmartap.entities.PaymentType;
import com.wwsa.woodworksmartap.repositories.IOrderRepository;
import com.wwsa.woodworksmartap.servicesinterfaces.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImplement implements OrderService {
    @Autowired
    private IOrderRepository or;
    @Override
    public void insert(Order order) {
        or.save(order);
    }
    @Override
    public List<Order> list() {
        return or.findAll();
    }
    @Override
    public void delete(int OrderId) {
        or.deleteById(OrderId);
    }
    @Override
    public Order listId(int OrderId) {
        return or.findById(OrderId).orElse(new Order());
    }
}
