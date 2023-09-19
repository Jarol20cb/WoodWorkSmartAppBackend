package com.wwsa.woodworksmartap.serviceimplements;
import com.wwsa.woodworksmartap.entities.Customer;
import com.wwsa.woodworksmartap.repositories.ICustomerRepository;
import com.wwsa.woodworksmartap.servicesinterfaces.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImplement implements CustomerService {
    @Autowired
    private ICustomerRepository cM;


    @Override
    public void insert(Customer cMr) {
        cM.save(cMr);
    }

    @Override
    public List<Customer> list() {
        return cM.findAll();
    }

    @Override
    public void delete(int CustomerID) {
        cM.deleteById(CustomerID);
    }

    @Override
    public Customer listId(int CustomerID) {
        return cM.findById(CustomerID).orElse(new Customer());
    }

    @Override
    public List<String[]> CountOrderByDni() {
        return cM.countOrderByDni();
    }


}
