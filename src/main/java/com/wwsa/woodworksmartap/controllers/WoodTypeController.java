package com.wwsa.woodworksmartap.controllers;

import com.wwsa.woodworksmartap.dtos.WoodTypeDTO;
import com.wwsa.woodworksmartap.entities.WoodType;
import com.wwsa.woodworksmartap.servicesinterfaces.WoodTypeService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/wood_type")
public class WoodTypeController {
    @Autowired
    private WoodTypeService wtS;

    @PostMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void registrar(@RequestBody WoodTypeDTO dto){
        ModelMapper m = new ModelMapper();
        WoodType wt = m.map(dto, WoodType.class);
        wtS.insert(wt);
    }
    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<WoodTypeDTO> Listar()
    {
        return wtS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,WoodTypeDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        wtS.delete(id);
    }

    @GetMapping("/{id}")
    public WoodTypeDTO ListarId(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        WoodTypeDTO dto = m.map((wtS.listId(id)),WoodTypeDTO.class);
        return dto;
    }

    @PutMapping
    public void Update(@RequestBody WoodTypeDTO dto){
        ModelMapper m = new ModelMapper();
        WoodType wt = m.map(dto, WoodType.class);
        wtS.insert(wt);
    }
}
