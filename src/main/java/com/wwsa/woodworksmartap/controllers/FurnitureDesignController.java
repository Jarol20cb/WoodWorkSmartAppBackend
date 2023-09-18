package com.wwsa.woodworksmartap.controllers;

import com.wwsa.woodworksmartap.dtos.FurnitureDesignDTO;
import com.wwsa.woodworksmartap.dtos.WoodCountMaxDTO;
import com.wwsa.woodworksmartap.entities.FurnitureDesign;
import com.wwsa.woodworksmartap.servicesinterfaces.FurnitureDesignService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
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
    public void registrar(@RequestBody FurnitureDesignDTO dto){
        ModelMapper m = new ModelMapper();
        FurnitureDesign fd = m.map(dto, FurnitureDesign.class);
        fdS.insert(fd);
    }

    @GetMapping
    public List<FurnitureDesignDTO> Listar(){
        return fdS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, FurnitureDesignDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/id")
    public void eliminar(@PathVariable("id") Integer id){
        fdS.delete(id);
    }

    @GetMapping("/id")
    public FurnitureDesignDTO ListarId(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        FurnitureDesignDTO dto = m.map((fdS.listId(id)), FurnitureDesignDTO.class);
        return dto;
    }

    @PutMapping
    public void Update(@RequestBody FurnitureDesignDTO dto){
        ModelMapper m = new ModelMapper();
        FurnitureDesign fd = m.map(dto, FurnitureDesign.class);
        fdS.insert(fd);
    }
    @GetMapping("/maderautilizada")
    public List<WoodCountMaxDTO> maderamasutilizada(){
        List<String[]>countwood= fdS.woodCount();
        List<WoodCountMaxDTO> woodCountMaxDTOS=new ArrayList<>();
        for(String[] data: countwood){
            WoodCountMaxDTO dto=new WoodCountMaxDTO();
            dto.setWoodname(data[0]);
            dto.setCount(Integer.parseInt(data[1]));
            woodCountMaxDTOS.add(dto);
        }
        return woodCountMaxDTOS;
    }
}
