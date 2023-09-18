package com.wwsa.woodworksmartap.dtos;

import com.wwsa.woodworksmartap.entities.Furniture;
import com.wwsa.woodworksmartap.entities.Order;

public class FurnitureOrderDTO {
    private int idfornitureorder;
    private Furniture furniture;
    private Order order;
    private int Quantity;



    public int getIdfornitureorder() {
        return idfornitureorder;
    }

    public void setIdfornitureorder(int idfornitureorder) {
        this.idfornitureorder = idfornitureorder;
    }

    public Furniture getFurniture() {
        return furniture;
    }

    public void setFurniture(Furniture furniture) {
        this.furniture = furniture;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }
}
