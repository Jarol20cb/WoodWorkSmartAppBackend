package com.wwsa.woodworksmartap.entities;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@DiscriminatorValue(value = "A")
@Table(name = "Customer")
public class Customer extends User{
    @Column(name = "ShippingAddress", nullable = false, length = 45)
    private String ShippingAddress;
    public Customer(){
    }
    public Customer(String shippingAddress) {
        ShippingAddress = shippingAddress;
    }

    public String getShippingAddress() {
        return ShippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        ShippingAddress = shippingAddress;
    }
}
