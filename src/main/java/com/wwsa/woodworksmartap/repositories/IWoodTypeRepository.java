package com.wwsa.woodworksmartap.repositories;

import com.wwsa.woodworksmartap.entities.WoodType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IWoodTypeRepository extends JpaRepository<WoodType, Integer> {
}
