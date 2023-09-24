package com.wwsa.woodworksmartap.servicesinterfaces;

import com.wwsa.woodworksmartap.entities.FurnitureType;

import java.util.List;

public interface FurnitureTypeService {
    public void insert(FurnitureType ft);
    public List<FurnitureType> list();
    public void delete(int idFurnitureType);
    public FurnitureType listId(int idFurnitureType);

}
