package com.wwsa.woodworksmartap.dtos;

import com.wwsa.woodworksmartap.entities.Customer;
import com.wwsa.woodworksmartap.entities.Furniture;

public class CustomerFurnitureDTO {
    private int idcustomerfurniture;
    private Furniture furniture;

    private  Customer customer;
    private int qualification;
    private String Comment;

    public int getIdcustomerfurniture() {
        return idcustomerfurniture;
    }

    public void setIdcustomerfurniture(int idcustomerfurniture) {
        this.idcustomerfurniture = idcustomerfurniture;
    }

    public Furniture getFurniture() {
        return furniture;
    }

    public void setFurniture(Furniture furniture) {
        this.furniture = furniture;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getQualification() {
        return qualification;
    }

    public void setQualification(int qualification) {
        this.qualification = qualification;
    }

    public String getComment() {
        return Comment;
    }

    public void setComment(String comment) {
        Comment = comment;
    }
}
