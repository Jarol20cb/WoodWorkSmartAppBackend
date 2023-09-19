package com.wwsa.woodworksmartap.dtos;
import com.wwsa.woodworksmartap.entities.Customer;
import com.wwsa.woodworksmartap.entities.PaymentType;
import java.time.LocalDate;

public class OrderDTO {
    private int OrderId;
    private int TotalPrice;
    private PaymentType payment;
    private Customer customer;
    private int TotalQuantity;
    private LocalDate OrderDate;

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
