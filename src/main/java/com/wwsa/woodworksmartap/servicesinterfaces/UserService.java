package com.wwsa.woodworksmartap.servicesinterfaces;

import com.wwsa.woodworksmartap.entities.User;

import java.util.List;

public interface UserService {
    public void insert(User user);
    public List<User> list();
    public void delete(int idUser);
    public User listId(int idUser);
}
