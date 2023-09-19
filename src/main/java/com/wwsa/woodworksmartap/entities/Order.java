package com.wwsa.woodworksmartap.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int OrderId;
    @Column(name = "TotalPrice", nullable = false, length = 100)
    private int TotalPrice;
    @ManyToOne
    @JoinColumn(name = "idPayment")
    private PaymentType payment;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
    @Column(name = "TotalQuantity", nullable = false, length = 100)
    private int TotalQuantity;
    @Column(name = "OrderDate", nullable = false)
    private LocalDate OrderDate;

    public Order() {
    }

    public Order(int orderId, int totalPrice, PaymentType payment, Customer customer, int totalQuantity, LocalDate orderDate) {
        OrderId = orderId;
        TotalPrice = totalPrice;
        this.payment = payment;
        this.customer = customer;
        TotalQuantity = totalQuantity;
        OrderDate = orderDate;
    }

    public int getOrderId() {
        return OrderId;
    }

    public void setOrderId(int orderId) {
        OrderId = orderId;
    }

    public int getTotalPrice() {
        return TotalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        TotalPrice = totalPrice;
    }

    public PaymentType getPayment() {
        return payment;
    }

    public void setPayment(PaymentType payment) {
        this.payment = payment;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getTotalQuantity() {
        return TotalQuantity;
    }

    public void setTotalQuantity(int totalQuantity) {
        TotalQuantity = totalQuantity;
    }

    public LocalDate getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        OrderDate = orderDate;
    }
}
