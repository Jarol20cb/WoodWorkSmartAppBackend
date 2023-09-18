package com.wwsa.woodworksmartap.servicesinterfaces;

import com.wwsa.woodworksmartap.entities.CustomerFurniture;

import java.util.List;

public interface CustomerFurnitureService {

    public void insert (CustomerFurniture cstmr);

    public List<CustomerFurniture> list(); //2

    public void delete(int idcustomerfurniture);

    public List<CustomerFurniture> findAllWithHighestQualification();
}
