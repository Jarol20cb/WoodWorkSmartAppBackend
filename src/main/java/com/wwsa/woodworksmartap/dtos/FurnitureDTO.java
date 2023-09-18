package com.wwsa.woodworksmartap.dtos;

import com.wwsa.woodworksmartap.entities.Carpenter;
import com.wwsa.woodworksmartap.entities.FurnitureDesign;

import java.time.LocalDate;

public class FurnitureDTO {

    private int furnitureId;

    private Carpenter carpenter;

    private FurnitureDesign furnitureDesign;

    private float priceFurniture;

    private LocalDate manufacturingDate;

    private String description;

    public int getFurnitureId() {
        return furnitureId;
    }

    public void setFurnitureId(int furnitureId) {
        this.furnitureId = furnitureId;
    }

    public Carpenter getCarpenter() {
        return carpenter;
    }

    public void setCarpenter(Carpenter carpenter) {
        this.carpenter = carpenter;
    }

    public FurnitureDesign getFurnitureDesign() {
        return furnitureDesign;
    }

    public void setFurnitureDesign(FurnitureDesign furnitureDesign) {
        this.furnitureDesign = furnitureDesign;
    }

    public float getPriceFurniture() {
        return priceFurniture;
    }

    public void setPriceFurniture(float priceFurniture) {
        this.priceFurniture = priceFurniture;
    }

    public LocalDate getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(LocalDate manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
