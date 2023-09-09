package com.wwsa.woodworksmartap.repositories;

import com.wwsa.woodworksmartap.entities.Color;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IColorRepository extends JpaRepository<Color, Integer> {
}
