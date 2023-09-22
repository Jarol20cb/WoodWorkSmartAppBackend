package com.wwsa.woodworksmartap.controllers;

import com.wwsa.woodworksmartap.dtos.FurnitureDTO;
import com.wwsa.woodworksmartap.entities.Furniture;
import com.wwsa.woodworksmartap.servicesinterfaces.IFurnitureService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/furnitures")
public class FurnitureController {
    @Autowired
    private IFurnitureService ftr;
    @PostMapping
    @PreAuthorize("hasAnyAuthority('ADMIN', 'CARPENTER')")
    public void registrar(@RequestBody FurnitureDTO dto){
        ModelMapper m = new ModelMapper();
        Furniture fd = m.map(dto, Furniture.class);
        ftr.insert(fd);
    }

    @GetMapping
    @PreAuthorize("hasAnyAuthority('ADMIN', 'CUSTOMER', 'CARPENTER')")
    public List<FurnitureDTO> Listar(){
        return ftr.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, FurnitureDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/id")
    @PreAuthorize("hasAnyAuthority('ADMIN', 'CARPENTER')")
    public void eliminar(@PathVariable("id") Integer id){
        ftr.delete(id);
    }


    @PutMapping
    @PreAuthorize("hasAnyAuthority('ADMIN', 'CARPENTER')")
    public void Update(@RequestBody FurnitureDTO dto){
        ModelMapper m = new ModelMapper();
        Furniture fd = m.map(dto, Furniture.class);
        ftr.insert(fd);
    }

    @PostMapping("/buscarPorFecha")
    @PreAuthorize("hasAnyAuthority('ADMIN', 'CUSTOMER', 'CARPENTER')")
    public List<FurnitureDTO> buscarPorFecha(@RequestBody LocalDate fecha){
        return ftr.findByManufacturingDate(fecha).stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x, FurnitureDTO.class);
        }).collect(Collectors.toList());
    }

}
