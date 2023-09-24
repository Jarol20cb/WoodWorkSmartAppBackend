package com.wwsa.woodworksmartap.controllers;

import com.wwsa.woodworksmartap.dtos.UserDTO;
import com.wwsa.woodworksmartap.entities.User;
import com.wwsa.woodworksmartap.servicesinterfaces.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService uS;

    @PostMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void registrar(@RequestBody UserDTO dto){
        ModelMapper m = new ModelMapper();
        User c = m.map(dto, User.class);
        uS.insert(c);
    }
    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<UserDTO> Listar()
    {
        return uS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,UserDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        uS.delete(id);
    }

    @GetMapping("/{id}")
    public UserDTO ListarId(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        UserDTO dto = m.map((uS.listId(id)),UserDTO.class);
        return dto;
    }

    @PutMapping
    public void Update(@RequestBody UserDTO dto){
        ModelMapper m = new ModelMapper();
        User c = m.map(dto, User.class);
        uS.insert(c);
    }
}
