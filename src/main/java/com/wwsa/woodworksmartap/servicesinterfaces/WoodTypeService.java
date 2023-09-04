package com.wwsa.woodworksmartap.servicesinterfaces;

import com.wwsa.woodworksmartap.entities.WoodType;

import java.util.List;

public interface WoodTypeService {
    public void insert(WoodType woodType);
    public List<WoodType> list();
    public void delete(int idWoodType);
    public WoodType listId(int idWoodType);
}
