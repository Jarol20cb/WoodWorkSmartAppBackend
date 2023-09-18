package com.wwsa.woodworksmartap.dtos;

import com.wwsa.woodworksmartap.entities.Customer;
import com.wwsa.woodworksmartap.entities.FurnitureType;
import com.wwsa.woodworksmartap.entities.WoodType;


public class FurnitureDesignDTO {
    private int FurnitureDesignId;
    private FurnitureType furniture_type;
    private WoodType wood_type;
    private Customer customer;
    private String Color;
    private float Width;
    private float Height;
    private float Depth;
    private int Estimate;

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
