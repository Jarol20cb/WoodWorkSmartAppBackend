package com.wwsa.woodworksmartap.serviceimplements;

import com.wwsa.woodworksmartap.entities.Furniture;
import com.wwsa.woodworksmartap.repositories.IFurnitureRepository;
import com.wwsa.woodworksmartap.servicesinterfaces.IFurnitureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FurnitureServiceImplement implements IFurnitureService {

    @Autowired
    private IFurnitureRepository fR;

    @Override
    public void insert(Furniture furniture) {
        fR.save(furniture);
    }

    @Override
    public List<Furniture> list() {
        return fR.findAll();
    }

    @Override
    public void delete(int furnitureId) {
        fR.deleteById(furnitureId);
    }

    @Override
    public Furniture listId(int furnitureId) {
        return fR.findById(furnitureId).orElse(new Furniture());
    }
}
