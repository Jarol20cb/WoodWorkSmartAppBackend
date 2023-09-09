package com.wwsa.woodworksmartap.dtos;

import com.wwsa.woodworksmartap.entities.Customer;
import com.wwsa.woodworksmartap.entities.Furniture;
import com.wwsa.woodworksmartap.entities.Qualification;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class CustomerFurnitureDTO {
    private int idcustomerfurniture;
    private Furniture furniture;

    private  Customer customer;
    private Qualification qualification;
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

    public Qualification getQualification() {
        return qualification;
    }

    public void setQualification(Qualification qualification) {
        this.qualification = qualification;
    }

    public String getComment() {
        return Comment;
    }

    public void setComment(String comment) {
        Comment = comment;
    }
}
