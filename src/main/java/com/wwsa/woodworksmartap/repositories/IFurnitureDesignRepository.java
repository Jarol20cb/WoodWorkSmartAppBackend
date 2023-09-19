package com.wwsa.woodworksmartap.repositories;

import com.wwsa.woodworksmartap.entities.FurnitureDesign;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFurnitureDesignRepository extends JpaRepository<FurnitureDesign, Integer> {
}
