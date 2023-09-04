package com.wwsa.woodworksmartap.dtos;

public class WoodTypeDTO {
    private int idWoodType;
    private String WoodTypeName;
    private String WoodTypeImage;

    public int getIdWoodType() {
        return idWoodType;
    }

    public void setIdWoodType(int idWoodType) {
        this.idWoodType = idWoodType;
    }

    public String getWoodTypeName() {
        return WoodTypeName;
    }

    public void setWoodTypeName(String woodTypeName) {
        WoodTypeName = woodTypeName;
    }

    public String getWoodTypeImage() {
        return WoodTypeImage;
    }

    public void setWoodTypeImage(String woodTypeImage) {
        WoodTypeImage = woodTypeImage;
    }
}
