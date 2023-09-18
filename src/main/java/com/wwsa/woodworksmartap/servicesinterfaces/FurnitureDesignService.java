package com.wwsa.woodworksmartap.servicesinterfaces;
import com.wwsa.woodworksmartap.entities.FurnitureDesign;

import java.util.List;

public interface FurnitureDesignService {
    public void insert(FurnitureDesign furnitureDesign);
    public List<FurnitureDesign> list();
    public void delete(int idFurnitureDesign);
    public FurnitureDesign listId(int idFurnitureDesign);
    public List<String[]>woodCount();

}
