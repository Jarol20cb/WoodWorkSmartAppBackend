package com.wwsa.woodworksmartap.controllers;
import com.wwsa.woodworksmartap.dtos.CustomerDTO;
import com.wwsa.woodworksmartap.entities.Customer;
import com.wwsa.woodworksmartap.servicesinterfaces.CustomerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    private CustomerService cMr;

    @PostMapping
    public void registrar(@RequestBody CustomerDTO dto){
        ModelMapper m = new ModelMapper();
        Customer c = m.map(dto, Customer.class);
        cMr.insert(c);
    }

    @GetMapping
    public List<CustomerDTO> Listar(){
        return cMr.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, CustomerDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/id")
    public void eliminar(@PathVariable("id") Integer id){
        cMr.delete(id);
    }

    @GetMapping("/id")
    public CustomerDTO ListarId(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        CustomerDTO dto = m.map((cMr.listId(id)), CustomerDTO.class);
        return dto;
    }

    @PutMapping
    public void Update(@RequestBody CustomerDTO dto){
        ModelMapper m = new ModelMapper();
        Customer c = m.map(dto, Customer.class);
        cMr.insert(c);
    }
}
