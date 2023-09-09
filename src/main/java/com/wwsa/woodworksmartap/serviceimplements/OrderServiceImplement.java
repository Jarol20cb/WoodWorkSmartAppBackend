package com.wwsa.woodworksmartap.serviceimplements;

import com.wwsa.woodworksmartap.entities.Order;
import com.wwsa.woodworksmartap.repositories.IOrderRepository;
import com.wwsa.woodworksmartap.servicesinterfaces.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImplement implements OrderService {

    @Autowired
    private IOrderRepository oR;
    @Override
    public void insert(Order order) {
        oR.save(order);
    }

    @Override
    public List<Order> list() {
        return oR.findAll();
    }

    @Override
    public void delete(int idOrder) {
        oR.deleteById(idOrder);
    }

    @Override
    public Order listId(int idOrder) {
        return oR.findById(idOrder).orElse(new Order());
    }
}
