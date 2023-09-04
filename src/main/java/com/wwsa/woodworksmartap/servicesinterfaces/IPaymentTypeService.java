package com.wwsa.woodworksmartap.servicesinterfaces;

import com.wwsa.woodworksmartap.entities.PaymentType;

import java.util.List;

public interface IPaymentTypeService {
    public void insert(PaymentType paymentType);
    public List<PaymentType> list();
    public void delete(int idPaymentType);
    public PaymentType listId(int idPaymentType);
}
