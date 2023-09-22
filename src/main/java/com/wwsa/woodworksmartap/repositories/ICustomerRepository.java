package com.wwsa.woodworksmartap.repositories;
import com.wwsa.woodworksmartap.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer, Integer> {
    @Query(value = "SELECT c.dni, COUNT(o.order_id) " +
            "FROM Customer c inner join Order o " +
            "ON c.customer_id = c.customer_id " +
            "GROUP BY c.dni " +
            "order BY COUNT(o.order_id) " +
            "DESC", nativeQuery = true)
    public List<String[]> countOrderByDni();
}
