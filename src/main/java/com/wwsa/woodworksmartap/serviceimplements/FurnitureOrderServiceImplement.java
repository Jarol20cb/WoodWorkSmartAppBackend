package com.wwsa.woodworksmartap.serviceimplements;

import com.wwsa.woodworksmartap.entities.FurnitureOrder;
import com.wwsa.woodworksmartap.repositories.IFurnitureOrderRepository;
import com.wwsa.woodworksmartap.servicesinterfaces.FurnitureOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FurnitureOrderServiceImplement implements FurnitureOrderService {
    @Autowired
    public IFurnitureOrderRepository foR;

    @Override
    public void insert(FurnitureOrder furnitureOrder) {
        foR.save(furnitureOrder);
    }

    @Override
    public List<FurnitureOrder> list() {
        return foR.findAll();
    }
}
