package com.wwsa.woodworksmartap.serviceimplements;

import com.wwsa.woodworksmartap.entities.CustomerFurniture;
import com.wwsa.woodworksmartap.repositories.ICustomerFurnitureRepository;
import com.wwsa.woodworksmartap.servicesinterfaces.CustomerFurnitureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service //1
public class CustomerFurnitureServiceImplement implements CustomerFurnitureService {

    @Autowired //4
    public ICustomerFurnitureRepository gaa; //3

    @Override
    public void insert(CustomerFurniture cstmr) {
        gaa.save(cstmr);
    }

    @Override
    public List<CustomerFurniture> list() {
        return gaa.findAll();
    }

    @Override
    public void delete(int idcustomerfurniture) {
        gaa.deleteById(idcustomerfurniture);
    }

    @Override
    public List<CustomerFurniture> findAllWithHighestQualification() {
        return gaa.findAllWithHighestQualification();
    }
}
