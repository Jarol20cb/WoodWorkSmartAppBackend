package com.wwsa.woodworksmartap.controllers;

import com.wwsa.woodworksmartap.dtos.FurnitureTypeDTO;
import com.wwsa.woodworksmartap.entities.FurnitureType;
import com.wwsa.woodworksmartap.servicesinterfaces.FurnitureTypeService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/furniturestype")
public class FurnitureTypeController {
    @Autowired
    private FurnitureTypeService ftS;

    @PostMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void registrar(@RequestBody FurnitureTypeDTO dto){
        ModelMapper m = new ModelMapper();
        FurnitureType fT = m.map(dto, FurnitureType.class);
        ftS.insert(fT);
    }

    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<FurnitureTypeDTO> Listar(){
        return ftS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, FurnitureTypeDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/id")
    public void eliminar(@PathVariable("id") Integer id){
        ftS.delete(id);
    }

    @GetMapping("/id")
    public FurnitureTypeDTO ListarId(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        FurnitureTypeDTO dto = m.map((ftS.listId(id)), FurnitureTypeDTO.class);
        return dto;
    }

    @PutMapping
    public void Update(@RequestBody FurnitureTypeDTO dto){
        ModelMapper m = new ModelMapper();
        FurnitureType fT = m.map(dto, FurnitureType.class);
        ftS.insert(fT);
    }
}
