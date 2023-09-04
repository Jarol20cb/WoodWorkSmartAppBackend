package com.wwsa.woodworksmartap.serviceimplements;
import com.wwsa.woodworksmartap.entities.User;
import com.wwsa.woodworksmartap.repositories.IUserrepository;
import com.wwsa.woodworksmartap.servicesinterfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImplement implements UserService {

    @Autowired
    private IUserrepository uS;
    @Override
    public void insert(User user) {
        uS.save(user);
    }

    @Override
    public List<User> list() {
        return uS.findAll();
    }

    @Override
    public void delete(int idUser) {
        uS.deleteById(idUser);
    }

    @Override
    public User listId(int idUser) {
        return uS.findById(idUser).orElse(new User());
    }
}
