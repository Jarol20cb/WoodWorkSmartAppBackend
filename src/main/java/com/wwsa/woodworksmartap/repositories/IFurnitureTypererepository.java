package com.wwsa.woodworksmartap.repositories;

import com.wwsa.woodworksmartap.entities.FurnitureType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFurnitureTypererepository extends JpaRepository<FurnitureType, Integer> {

}
