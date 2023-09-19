package com.wwsa.woodworksmartap.entities;

import javax.persistence.*;

@Entity
@Table(name = "furniture_design")
public class FurnitureDesign {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int FurnitureDesignId;
    @ManyToOne
    @JoinColumn(name = "FurnitureTypeId")
    private FurnitureType furniture_type;
    @ManyToOne
    @JoinColumn(name = "WoodTypeId")
    private WoodType wood_type;
    @ManyToOne
    @JoinColumn(name = "CustomerId")
    private Customer customer;

    @Column (name = "Color", nullable = false, length = 100)
    private String Color;
    @Column(name = "Width", nullable = false, length = 100)
    private float Width;
    @Column(name = "Height", nullable = false, length = 100)
    private float Height;
    @Column(name = "Depth", nullable = false, length = 100)
    private float Depth;
    @Column(name = "Estimate", nullable = false, length = 100)
    private int Estimate;

    public FurnitureDesign() {
    }

    public FurnitureDesign(int furnitureDesignId, FurnitureType furniture_type, WoodType wood_type, Customer customer, String color, float width, float height, float depth, int estimate) {
        FurnitureDesignId = furnitureDesignId;
        this.furniture_type = furniture_type;
        this.wood_type = wood_type;
        this.customer = customer;
        Color = color;
        Width = width;
        Height = height;
        Depth = depth;
        Estimate = estimate;
    }

    public int getFurnitureDesignId() {
        return FurnitureDesignId;
    }

    public void setFurnitureDesignId(int furnitureDesignId) {
        FurnitureDesignId = furnitureDesignId;
    }

    public FurnitureType getFurniture_type() {
        return furniture_type;
    }

    public void setFurniture_type(FurnitureType furniture_type) {
        this.furniture_type = furniture_type;
    }

    public WoodType getWood_type() {
        return wood_type;
    }

    public void setWood_type(WoodType wood_type) {
        this.wood_type = wood_type;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public float getWidth() {
        return Width;
    }

    public void setWidth(float width) {
        Width = width;
    }

    public float getHeight() {
        return Height;
    }

    public void setHeight(float height) {
        Height = height;
    }

    public float getDepth() {
        return Depth;
    }

    public void setDepth(float depth) {
        Depth = depth;
    }

    public int getEstimate() {
        return Estimate;
    }

    public void setEstimate(int estimate) {
        Estimate = estimate;
    }
}
