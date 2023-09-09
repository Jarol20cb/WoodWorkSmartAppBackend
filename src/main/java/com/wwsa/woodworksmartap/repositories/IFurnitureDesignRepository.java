package com.wwsa.woodworksmartap.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.wwsa.woodworksmartap.entities.FurnitureDesign;
import org.springframework.stereotype.Repository;

@Repository
public interface IFurnitureDesignRepository extends JpaRepository<FurnitureDesign, Integer> {
}
