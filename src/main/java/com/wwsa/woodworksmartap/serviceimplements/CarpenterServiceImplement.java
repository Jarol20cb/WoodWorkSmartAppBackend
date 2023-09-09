package com.wwsa.woodworksmartap.serviceimplements;
import com.wwsa.woodworksmartap.entities.Carpenter;
import com.wwsa.woodworksmartap.repositories.ICarpenterRepository;
import com.wwsa.woodworksmartap.servicesinterfaces.CarpenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarpenterServiceImplement implements CarpenterService {
    @Autowired
    private ICarpenterRepository cr;


    @Override
    public void insert(Carpenter Cpt) {
        cr.save(Cpt);
    }

    @Override
    public List<Carpenter> list() {
        return cr.findAll();
    }

    @Override
    public void delete(int CarpenterID) {
        cr.deleteById(CarpenterID);
    }

    @Override
    public Carpenter listId(int CarpenterID) {
        return cr.findById(CarpenterID).orElse(new Carpenter());
    }
}
