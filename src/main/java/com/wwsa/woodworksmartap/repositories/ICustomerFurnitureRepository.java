package com.wwsa.woodworksmartap.repositories;


import com.wwsa.woodworksmartap.entities.CustomerFurniture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository //1
public interface ICustomerFurnitureRepository extends JpaRepository<CustomerFurniture, Integer> {

    // Query para obtener los datos de con la mayor calificacion
    // JAROL
    // jarol
    @Query(nativeQuery = true, value = "SELECT * FROM customerforniture WHERE qualification = (SELECT MAX(qualification) FROM customerforniture)")
    List<CustomerFurniture> findAllWithHighestQualification();

}