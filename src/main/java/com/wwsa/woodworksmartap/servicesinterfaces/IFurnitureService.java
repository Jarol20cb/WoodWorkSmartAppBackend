package com.wwsa.woodworksmartap.servicesinterfaces;

import com.wwsa.woodworksmartap.entities.Furniture;

import java.time.LocalDate;
import java.util.List;

public interface IFurnitureService {

    public void insert(Furniture furniture);
    public List<Furniture> list();
    public void delete(int furnitureId);
    public Furniture listId(int furnitureId);
    List<Furniture> findByManufacturingDate(LocalDate manufacturingDate);

}
