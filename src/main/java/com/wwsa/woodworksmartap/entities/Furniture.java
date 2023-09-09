package com.wwsa.woodworksmartap.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "furniture")
public class Furniture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int furnitureId;

    @ManyToOne
    @JoinColumn(name = "carpenterId")
    private Carpenter carpenter;

    @ManyToOne
    @JoinColumn(name = "furnitureDesignId")
    private FurnitureDesign furnitureDesign;

    @Column(name = "priceFurniture", nullable = false, length = 10)
    private float priceFurniture;

    @Column(name = "manufacturingDate", nullable = false)
    private LocalDate manufacturingDate;

    @Column(name = "description", nullable = false, length = 200)
    private String description;

    public Furniture() {
    }

    public Furniture(int furnitureId, Carpenter carpenter, FurnitureDesign furnitureDesign, float priceFurniture, LocalDate manufacturingDate, String description) {
        this.furnitureId = furnitureId;
        this.carpenter = carpenter;
        this.furnitureDesign = furnitureDesign;
        this.priceFurniture = priceFurniture;
        this.manufacturingDate = manufacturingDate;
        this.description = description;
    }

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
