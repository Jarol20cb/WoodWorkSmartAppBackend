package com.wwsa.woodworksmartap.controllers;

import com.wwsa.woodworksmartap.dtos.PaymentTypeDTO;
import com.wwsa.woodworksmartap.entities.PaymentType;
import com.wwsa.woodworksmartap.servicesinterfaces.IPaymentTypeService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/payment_type")
public class PaymentTypeController {
    @Autowired
    private IPaymentTypeService uS;

    @PostMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void registrar(@RequestBody PaymentTypeDTO dto){
        ModelMapper m = new ModelMapper();
        PaymentType c = m.map(dto, PaymentType.class);
        uS.insert(c);
    }
    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<PaymentTypeDTO> Listar()
    {
        return uS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,PaymentTypeDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        uS.delete(id);
    }

    @GetMapping("/{id}")
    public PaymentTypeDTO ListarId(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        PaymentTypeDTO dto = m.map((uS.listId(id)),PaymentTypeDTO.class);
        return dto;
    }

    @PutMapping
    public void Update(@RequestBody PaymentTypeDTO dto){
        ModelMapper m = new ModelMapper();
        PaymentType c = m.map(dto, PaymentType.class);
        uS.insert(c);
    }
}
