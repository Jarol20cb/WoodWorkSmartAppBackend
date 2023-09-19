package com.wwsa.woodworksmartap.servicesinterfaces;

import com.wwsa.woodworksmartap.entities.FurnitureOrder;

import java.util.List;


public interface FurnitureOrderService {
    public void insert(FurnitureOrder furnitureOrder);
    public List<FurnitureOrder> list();

}
