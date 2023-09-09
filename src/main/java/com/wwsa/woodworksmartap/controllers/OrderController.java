package com.wwsa.woodworksmartap.controllers;

import com.wwsa.woodworksmartap.dtos.OrderDTO;
import com.wwsa.woodworksmartap.entities.Order;
import com.wwsa.woodworksmartap.servicesinterfaces.OrderService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService oS;

    @PostMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void registrar(@RequestBody OrderDTO dto){
        ModelMapper m = new ModelMapper();
        Order o = m.map(dto, Order.class);
        oS.insert(o);
    }

    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<OrderDTO> Listar(){
        return oS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, OrderDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/id")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void eliminar(@PathVariable("id") Integer id){
        oS.delete(id);
    }

    @GetMapping("/id")
    @PreAuthorize("hasAuthority('ADMIN')")
    public OrderDTO ListarId(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        OrderDTO dto = m.map((oS.listId(id)), OrderDTO.class);
        return dto;
    }

    @PutMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void Update(@RequestBody OrderDTO dto){
        ModelMapper m = new ModelMapper();
        Order o = m.map(dto, Order.class);
        oS.insert(o);
    }
}
