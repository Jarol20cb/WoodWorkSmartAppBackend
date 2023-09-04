package com.wwsa.woodworksmartap.serviceimplements;

import com.wwsa.woodworksmartap.entities.PaymentType;
import com.wwsa.woodworksmartap.repositories.IPaymentTypeRepository;
import com.wwsa.woodworksmartap.servicesinterfaces.IPaymentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentTypeServiceImplement implements IPaymentTypeService {
    @Autowired
    private IPaymentTypeRepository uS;
    @Override
    public void insert(PaymentType paymentType) {
        uS.save(paymentType);
    }

    @Override
    public List<PaymentType> list() {
        return uS.findAll();
    }

    @Override
    public void delete(int idPaymentType) {
        uS.deleteById(idPaymentType);
    }

    @Override
    public PaymentType listId(int idPaymentType) {
        return uS.findById(idPaymentType).orElse(new PaymentType());
    }
}
