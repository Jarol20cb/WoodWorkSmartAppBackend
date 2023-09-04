package com.wwsa.woodworksmartap.dtos;

public class FurnitureTypeDTO {
    private int idFurnitureType;
    private String FurnitureTypeName;
    private String FurnitureTypeImage;

    public int getIdFurnitureType() {return idFurnitureType;}

    public void setIdFurnitureType(int idFurnitureType) {this.idFurnitureType = idFurnitureType;}

    public String getFurnitureTypeName() {return FurnitureTypeName;}

    public void setFurnitureTypeName(String furnitureTypeName) {FurnitureTypeName = furnitureTypeName;}

    public String getFurnitureTypeImage() {return FurnitureTypeImage;}

    public void setFurnitureTypeImage(String furnitureTypeImage) {FurnitureTypeImage = furnitureTypeImage;}
}
