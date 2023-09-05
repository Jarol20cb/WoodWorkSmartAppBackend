package com.wwsa.woodworksmartap.repositories;

import com.wwsa.woodworksmartap.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserrepository extends JpaRepository<User,Integer> {

}
