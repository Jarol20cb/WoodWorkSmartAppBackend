package com.wwsa.woodworksmartap.repositories;

import com.wwsa.woodworksmartap.entities.FurnitureOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFurnitureOrderRepository extends JpaRepository<FurnitureOrder, Integer> {
}
