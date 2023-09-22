package com.wwsa.woodworksmartap.servicesinterfaces;

import com.wwsa.woodworksmartap.entities.Customer;

import java.util.List;

public interface CustomerService {
    public void insert(Customer cMr);
    public List<Customer> list();
    public void delete(int CustomerID);
    public Customer listId(int CustomerID);
    public List<String[]> CountOrderByDni();
}
