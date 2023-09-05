package com.wwsa.woodworksmartap.dtos;

public class PaymentTypeDTO {
    private int idPayment;
    private String NamePaymentType;

    public int getIdPayment() {
        return idPayment;
    }

    public void setIdPayment(int idPayment) {
        this.idPayment = idPayment;
    }

    public String getNamePaymentType() {
        return NamePaymentType;
    }

    public void setNamePaymentType(String namePaymentType) {
        NamePaymentType = namePaymentType;
    }
}
