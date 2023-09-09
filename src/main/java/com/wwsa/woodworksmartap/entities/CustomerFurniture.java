package com.wwsa.woodworksmartap.entities;



import javax.persistence.*;
@Entity
@Table(name="customerforniture")
public class CustomerFurniture{

    @Id //6
    @GeneratedValue( strategy =  GenerationType.IDENTITY)
    private int idcustomerfurniture;
    @ManyToOne
    @JoinColumn(name = "furnitureId")
    private Furniture furniture;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private  Customer customer;
    @ManyToOne
    @JoinColumn(name = "QualificationID")
    private Qualification qualification;
    @Column (name = "Comment", nullable = false,length = 255)
    private String Comment;
    public CustomerFurniture(){   //17
    }

    public CustomerFurniture(int idcustomerfurniture, Furniture furniture, Customer customer, Qualification qualification, String comment) {
        this.idcustomerfurniture = idcustomerfurniture;
        this.furniture = furniture;
        this.customer = customer;
        this.qualification = qualification;
        Comment = comment;
    }

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
