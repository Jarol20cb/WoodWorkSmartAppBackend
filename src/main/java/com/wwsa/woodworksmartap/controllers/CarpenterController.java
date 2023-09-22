package com.wwsa.woodworksmartap.controllers;

import com.wwsa.woodworksmartap.dtos.CarpenterDTO;
import com.wwsa.woodworksmartap.entities.Carpenter;
import com.wwsa.woodworksmartap.servicesinterfaces.CarpenterService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/carpenters")
public class CarpenterController {
    @Autowired
    private CarpenterService Cs;

    @PostMapping
    @PreAuthorize("hasAnyAuthority('ADMIN', 'CARPENTER')")
    public void registrar(@RequestBody CarpenterDTO dto){
        ModelMapper m = new ModelMapper();
        Carpenter c = m.map(dto, Carpenter.class);
        Cs.insert(c);
    }

    @GetMapping
    @PreAuthorize("hasAnyAuthority('ADMIN', 'CUSTOMER', 'CARPENTER')")
    public List<CarpenterDTO> Listar(){
        return Cs.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, CarpenterDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/id")
    @PreAuthorize("hasAnyAuthority('ADMIN')")
    public void eliminar(@PathVariable("id") Integer id){
        Cs.delete(id);
    }

    @GetMapping("/id")
    @PreAuthorize("hasAnyAuthority('ADMIN', 'CUSTOMER', 'CARPENTER')")
    public CarpenterDTO ListarId(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        CarpenterDTO dto = m.map((Cs.listId(id)), CarpenterDTO.class);
        return dto;
    }

    @PutMapping
    @PreAuthorize("hasAnyAuthority('ADMIN', 'CARPENTER')")
    public void Update(@RequestBody CarpenterDTO dto){
        ModelMapper m = new ModelMapper();
        Carpenter c = m.map(dto, Carpenter.class);
        Cs.insert(c);
    }
}
