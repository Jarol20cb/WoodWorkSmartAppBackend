package com.wwsa.woodworksmartap.entities;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@DiscriminatorValue(value = "B")
@Table(name = "Carpenter")
public class Carpenter extends User{
    @Column(name = "Ruc", nullable = false, length = 45)
    private String Ruc;
    public Carpenter() {
    }
    public Carpenter(String ruc) {
        Ruc = ruc;
    }
    public String getRuc() {return Ruc; }
    public void setRuc(String ruc) {
        Ruc = ruc;
    }
}
