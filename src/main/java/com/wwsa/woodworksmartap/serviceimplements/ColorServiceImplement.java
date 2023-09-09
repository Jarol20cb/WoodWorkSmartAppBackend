package com.wwsa.woodworksmartap.serviceimplements;

import com.wwsa.woodworksmartap.entities.Color;
import com.wwsa.woodworksmartap.entities.FurnitureType;
import com.wwsa.woodworksmartap.repositories.IColorRepository;
import com.wwsa.woodworksmartap.servicesinterfaces.ColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ColorServiceImplement implements ColorService {
    @Autowired
    private IColorRepository Clor;

    @Override
    public void insert(Color Clr) {
        Clor.save(Clr);
    }

    @Override
    public List<Color> list() {
        return Clor.findAll();
    }

    @Override
    public void delete(int ColorID) {
        Clor.deleteById(ColorID);
    }

    @Override
    public Color listId(int ColorID) {
        return Clor.findById(ColorID).orElse(new Color());
    }
}
