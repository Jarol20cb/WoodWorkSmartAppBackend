package com.wwsa.woodworksmartap.entities;

import javax.persistence.*;

@Entity
@Table(name = "wood_type")
public class WoodType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idWoodType;
    @Column(name = "WoodTypeName",nullable = false, length = 40)
    private String WoodTypeName;
    @Column(name = "WoodTypeImage",nullable = false, length = 40)
    private String WoodTypeImage;

    public WoodType() {
    }

    public WoodType(int idWoodType, String woodTypeName, String woodTypeImage) {
        this.idWoodType = idWoodType;
        WoodTypeName = woodTypeName;
        WoodTypeImage = woodTypeImage;
    }

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
