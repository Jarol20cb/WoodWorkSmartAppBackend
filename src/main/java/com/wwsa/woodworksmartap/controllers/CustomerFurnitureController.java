package com.wwsa.woodworksmartap.controllers;

import com.wwsa.woodworksmartap.dtos.CustomerFurnitureDTO;
import com.wwsa.woodworksmartap.entities.CustomerFurniture;
import com.wwsa.woodworksmartap.servicesinterfaces.CustomerFurnitureService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.stream.Collectors;
@RestController
@RequestMapping("/customerFurniture")
public class CustomerFurnitureController {

    @Autowired
    private CustomerFurnitureService xd;

    @PostMapping
    public void registrar(@RequestBody CustomerFurnitureDTO dto){
        ModelMapper m = new ModelMapper();
        CustomerFurniture c = m.map(dto, CustomerFurniture.class);
        xd.insert(c);
    }
    @GetMapping
    public List<CustomerFurnitureDTO> Listar(){
        return xd.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, CustomerFurnitureDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/id")
    public void eliminar(@PathVariable("id") Integer id){
        xd.delete(id);
    }

}
