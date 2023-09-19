package com.wwsa.woodworksmartap.repositories;

import com.wwsa.woodworksmartap.entities.Furniture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFurnitureRepository extends JpaRepository<Furniture, Integer> {

}
