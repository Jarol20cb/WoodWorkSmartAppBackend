package com.wwsa.woodworksmartap.repositories;
import com.wwsa.woodworksmartap.entities.Carpenter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICarpenterRepository extends JpaRepository<Carpenter, Integer> {
}
