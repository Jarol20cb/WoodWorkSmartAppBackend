package com.wwsa.woodworksmartap.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "FurnitureOrder")
public class FurnitureOrder implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idfornitureorder;
    @ManyToOne
    @JoinColumn(name = "furnitureId")
    private Furniture furniture;

    @ManyToOne
    @JoinColumn(name = "OrderId")
    private Order order;

    @Column(name = "Quantity", nullable = false, length = 100)
    private int quantity;

    public FurnitureOrder() {}

    public FurnitureOrder(int idfornitureorder, Furniture furniture, Order order, int quantity) {
        this.idfornitureorder = idfornitureorder;
        this.furniture = furniture;
        this.order = order;
        this.quantity = quantity;
    }

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
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
