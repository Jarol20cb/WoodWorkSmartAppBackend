package com.wwsa.woodworksmartap.repositories;
import com.wwsa.woodworksmartap.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrderRepository extends JpaRepository<Order, Integer> {
}
