package com.wwsa.woodworksmartap.repositories;

import com.wwsa.woodworksmartap.entities.PaymentType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPaymentTypeRepository extends JpaRepository<PaymentType,Integer> {

}
