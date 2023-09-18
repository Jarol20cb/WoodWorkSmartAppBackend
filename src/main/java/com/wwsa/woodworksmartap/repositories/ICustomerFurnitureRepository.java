package com.wwsa.woodworksmartap.repositories;


import com.wwsa.woodworksmartap.entities.CustomerFurniture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //1
public interface ICustomerFurnitureRepository extends JpaRepository<CustomerFurniture, Integer> {
}