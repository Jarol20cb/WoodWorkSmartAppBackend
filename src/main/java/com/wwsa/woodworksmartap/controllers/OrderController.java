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
    private OrderService oR;
    @PostMapping
    @PreAuthorize("hasAnyAuthority('ADMIN', 'CUSTOMER')")
    public void registrar(@RequestBody OrderDTO dto){
        ModelMapper m = new ModelMapper();
        Order c = m.map(dto, Order.class);
        oR.insert(c);
    }
    @GetMapping
    @PreAuthorize("hasAnyAuthority('ADMIN', 'CUSTOMER', 'CARPENTER')")
    public List<OrderDTO> Listar()
    {
        return oR.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,OrderDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAnyAuthority('ADMIN', 'CUSTOMER')")
    public void eliminar(@PathVariable("id") Integer id){
        oR.delete(id);
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasAnyAuthority('ADMIN')")
    public OrderDTO ListarId(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        OrderDTO dto = m.map((oR.listId(id)),OrderDTO.class);
        return dto;
    }

    @PutMapping
    @PreAuthorize("hasAnyAuthority('ADMIN', 'CUSTOMER')")
    public void Update(@RequestBody OrderDTO dto){
        ModelMapper m = new ModelMapper();
        Order c = m.map(dto, Order.class);
        oR.insert(c);
    }
}
