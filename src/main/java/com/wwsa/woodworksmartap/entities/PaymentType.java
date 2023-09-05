package com.wwsa.woodworksmartap.entities;

import javax.persistence.*;

@Entity
@Table(name = "payment_type")
public class PaymentType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPayment;
    @Column(name = "NamePaymentType", nullable = false, length = 40)
    private String NamePaymentType;

    public PaymentType() {    }

    public PaymentType(int idPayment, String namePaymentType) {
        this.idPayment = idPayment;
        NamePaymentType = namePaymentType;
    }

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
