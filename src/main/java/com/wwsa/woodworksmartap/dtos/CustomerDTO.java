package com.wwsa.woodworksmartap.dtos;

public class CustomerDTO extends UserDTO{
    private String ShippingAddress;
    public String getShippingAddress() {
        return ShippingAddress;
    }
    public void setShippingAddress(String shippingAddress) {
        ShippingAddress = shippingAddress;
    }
}
