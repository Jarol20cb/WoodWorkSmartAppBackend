package com.wwsa.woodworksmartap.serviceimplements;

import com.wwsa.woodworksmartap.entities.FurnitureDesign;
import com.wwsa.woodworksmartap.repositories.IFurnitureDesignRepository;
import com.wwsa.woodworksmartap.servicesinterfaces.FurnitureDesignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FurnitureDesignServiceImplement implements FurnitureDesignService {
    @Autowired
    public IFurnitureDesignRepository fdR;
    @Override
    public void insert(FurnitureDesign furnitureDesign) {
        fdR.save(furnitureDesign);
    }

    @Override
    public List<FurnitureDesign> list() {
        return fdR.findAll();
    }

    @Override
    public void delete(int idFurnitureDesign) {
        fdR.deleteById(idFurnitureDesign);
    }

    @Override
    public FurnitureDesign listId(int idFurnitureDesign) {
        return fdR.findById(idFurnitureDesign).orElse(new FurnitureDesign());
    }

    @Override
    public List<String[]> woodCount() {return fdR.woodCount();}
}
