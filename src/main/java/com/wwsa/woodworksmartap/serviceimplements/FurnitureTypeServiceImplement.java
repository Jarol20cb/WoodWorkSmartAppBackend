package com.wwsa.woodworksmartap.serviceimplements;

import com.wwsa.woodworksmartap.entities.FurnitureType;
import com.wwsa.woodworksmartap.repositories.IFurnitureTypererepository;
import com.wwsa.woodworksmartap.servicesinterfaces.FurnitureTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FurnitureTypeServiceImplement implements FurnitureTypeService {

    @Autowired
    private IFurnitureTypererepository fT;
    @Override
    public void insert(FurnitureType ft) {fT.save(ft);}

    @Override
    public List<FurnitureType> list() {return fT.findAll();}

    @Override
    public void delete(int idFurnitureType) {fT.deleteById(idFurnitureType);}

    @Override
    public FurnitureType listId(int idFurnitureType) {
        return fT.findById(idFurnitureType).orElse(new FurnitureType());
    }
}
