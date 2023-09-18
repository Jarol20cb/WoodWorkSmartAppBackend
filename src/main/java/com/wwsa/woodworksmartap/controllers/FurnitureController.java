package com.wwsa.woodworksmartap.controllers;

import com.wwsa.woodworksmartap.dtos.FurnitureDTO;
import com.wwsa.woodworksmartap.entities.Furniture;
import com.wwsa.woodworksmartap.servicesinterfaces.IFurnitureService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/furniture")
public class FurnitureController {

    @Autowired
    private IFurnitureService fS;

    @PostMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void registrar(@RequestBody FurnitureDTO dto) {
        ModelMapper m = new ModelMapper();
        Furniture f = m.map(dto, Furniture.class);
        fS.insert(f);
    }

    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<FurnitureDTO> Listar() {
        return fS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, FurnitureDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/id")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void eliminar(@PathVariable("id") Integer id) {
        fS.delete(id);
    }

    @GetMapping("/id")
    @PreAuthorize("hasAuthority('ADMIN')")
    public FurnitureDTO ListarId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        FurnitureDTO dto = m.map((fS.listId(id)), FurnitureDTO.class);
        return dto;
    }

    @PutMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void Update(@RequestBody FurnitureDTO dto) {
        ModelMapper m = new ModelMapper();
        Furniture f = m.map(dto, Furniture.class);
        fS.insert(f);
    }
}
