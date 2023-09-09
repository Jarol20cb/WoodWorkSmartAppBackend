package com.wwsa.woodworksmartap.serviceimplements;

import com.wwsa.woodworksmartap.entities.WoodType;
import com.wwsa.woodworksmartap.repositories.IWoodTypeRepository;
import com.wwsa.woodworksmartap.servicesinterfaces.WoodTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
//hubo problemas aca
@Service
public class WoodTypeServiceImplement implements WoodTypeService {
    @Autowired
    private IWoodTypeRepository wtS;
    @Override
    public void insert(WoodType woodType) {
        wtS.save(woodType);
    }

    @Override
    public List<WoodType> list() {
        return wtS.findAll();
    }

    @Override
    public void delete(int idWoodType) {
        wtS.deleteById(idWoodType);
    }

    @Override
    public WoodType listId(int idWoodType) {
        return wtS.findById(idWoodType).orElse(new WoodType());
    }
}
