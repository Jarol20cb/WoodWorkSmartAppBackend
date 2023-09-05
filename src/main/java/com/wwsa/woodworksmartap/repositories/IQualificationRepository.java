package com.wwsa.woodworksmartap.repositories;

import com.wwsa.woodworksmartap.entities.Qualification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IQualificationRepository extends JpaRepository<Qualification,Integer> {
}
