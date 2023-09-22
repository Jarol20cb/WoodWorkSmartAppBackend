package com.wwsa.woodworksmartap.controllers;

import com.wwsa.woodworksmartap.dtos.FurnitureOrderDTO;
import com.wwsa.woodworksmartap.entities.FurnitureOrder;
import com.wwsa.woodworksmartap.servicesinterfaces.FurnitureOrderService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/furniture_order")
public class FurnitureOrderController {
    @Autowired
    private FurnitureOrderService foS;
    @PostMapping
    @PreAuthorize("hasAnyAuthority('ADMIN')")
    public void registrar(@RequestBody FurnitureOrderDTO dto){
        ModelMapper m = new ModelMapper();
        FurnitureOrder fo = m.map(dto, FurnitureOrder.class);
        foS.insert(fo);
    }
    @GetMapping
    @PreAuthorize("hasAnyAuthority('ADMIN', 'CUSTOMER', 'CARPENTER')")
    public List<FurnitureOrderDTO> Listar(){
        return foS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, FurnitureOrderDTO.class);
        }).collect(Collectors.toList());
    }
    @PutMapping
    @PreAuthorize("hasAnyAuthority('ADMIN')")
    public void Update(@RequestBody FurnitureOrderDTO dto){
        ModelMapper m = new ModelMapper();
        FurnitureOrder fo = m.map(dto, FurnitureOrder.class);
        foS.insert(fo);
    }
}
