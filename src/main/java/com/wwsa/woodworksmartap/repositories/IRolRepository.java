package com.wwsa.woodworksmartap.repositories;

import com.wwsa.woodworksmartap.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRolRepository extends JpaRepository<Role, Long> {

}
