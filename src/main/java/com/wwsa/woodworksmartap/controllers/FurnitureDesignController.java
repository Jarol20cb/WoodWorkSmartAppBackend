package com.wwsa.woodworksmartap.controllers;

import com.wwsa.woodworksmartap.dtos.CountFurnitureTypeDTO;
import com.wwsa.woodworksmartap.dtos.FurnitureDesignDTO;
import com.wwsa.woodworksmartap.entities.FurnitureDesign;
import com.wwsa.woodworksmartap.servicesinterfaces.FurnitureDesignService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/furniture_design")
public class FurnitureDesignController {
    @Autowired
    private FurnitureDesignService fdS;

    @PostMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void registrar(@RequestBody FurnitureDesignDTO dto){
        ModelMapper m = new ModelMapper();
        FurnitureDesign fd = m.map(dto, FurnitureDesign.class);
        fdS.insert(fd);
    }

    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<FurnitureDesignDTO> Listar(){
        return fdS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, FurnitureDesignDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/id")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void eliminar(@PathVariable("id") Integer id){
        fdS.delete(id);
    }

    @GetMapping("/id")
    @PreAuthorize("hasAuthority('ADMIN')")
    public FurnitureDesignDTO ListarId(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        FurnitureDesignDTO dto = m.map((fdS.listId(id)), FurnitureDesignDTO.class);
        return dto;
    }

    @PutMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void Update(@RequestBody FurnitureDesignDTO dto){
        ModelMapper m = new ModelMapper();
        FurnitureDesign fd = m.map(dto, FurnitureDesign.class);
        fdS.insert(fd);
    }

    @GetMapping("/contartipodemueble")
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<CountFurnitureTypeDTO> contarTipoDeMueble(){
        List<String[]> countFurnitureType = fdS.countByFurnitureType();
        List<CountFurnitureTypeDTO> countFurnitureTypeDTOS = new ArrayList<>();

        for (String[] data : countFurnitureType){
            CountFurnitureTypeDTO dto = new CountFurnitureTypeDTO();
            dto.setFurnitureTypeName(data[0]);
            dto.setCountFurnitureType(Integer.parseInt(data[1]));
            countFurnitureTypeDTOS.add(dto);
        }
        return countFurnitureTypeDTOS;
    }
}
