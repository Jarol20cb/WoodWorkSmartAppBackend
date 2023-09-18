package com.wwsa.woodworksmartap.entities;

import javax.persistence.*;

@Entity
@Table(name = "furnitureTypes")
public class FurnitureType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idFurnitureType;

    @Column(name = "FurnitureTypeName", nullable = false, length = 40)
    private String FurnitureTypeName;

    @Column(name = "FurnitureTypeImage", nullable = false, length = 40)
    private String FurnitureTypeImage;

    public FurnitureType() {}

    public FurnitureType(int idFurnitureType, String furnitureTypeName, String furnitureTypeImage) {
        this.idFurnitureType = idFurnitureType;
        FurnitureTypeName = furnitureTypeName;
        FurnitureTypeImage = furnitureTypeImage;
    }

    public int getIdFurnitureType() {return idFurnitureType;}

    public void setIdFurnitureType(int idFurnitureType) {this.idFurnitureType = idFurnitureType;}

    public String getFurnitureTypeName() {return FurnitureTypeName;}

    public void setFurnitureTypeName(String furnitureTypeName) {FurnitureTypeName = furnitureTypeName;}

    public String getFurnitureTypeImage() {return FurnitureTypeImage;}

    public void setFurnitureTypeImage(String furnitureTypeImage) {FurnitureTypeImage = furnitureTypeImage;}
}
