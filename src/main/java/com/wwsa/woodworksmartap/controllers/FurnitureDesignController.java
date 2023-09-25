package com.wwsa.woodworksmartap.controllers;

import com.wwsa.woodworksmartap.dtos.CountFurnitureTypeDTO;
import com.wwsa.woodworksmartap.dtos.FurnitureDesignDTO;
import com.wwsa.woodworksmartap.dtos.WoodCountMaxDTO;
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

    //
    @PostMapping
    @PreAuthorize("hasAnyAuthority('ADMIN', 'CUSTOMER')")
    public void registrar(@RequestBody FurnitureDesignDTO dto){
        ModelMapper m = new ModelMapper();
        FurnitureDesign fd = m.map(dto, FurnitureDesign.class);
        fdS.insert(fd);
    }

    @GetMapping
    @PreAuthorize("hasAnyAuthority('ADMIN', 'CARPENTER', 'CUSTOMER')")
    public List<FurnitureDesignDTO> Listar(){
        return fdS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, FurnitureDesignDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/id")
    @PreAuthorize("hasAnyAuthority('ADMIN', 'CUSTOMER')")
    public void eliminar(@PathVariable("id") Integer id){
        fdS.delete(id);
    }

    @GetMapping("/id")
    @PreAuthorize("hasAnyAuthority('ADMIN')")
    public FurnitureDesignDTO ListarId(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        FurnitureDesignDTO dto = m.map((fdS.listId(id)), FurnitureDesignDTO.class);
        return dto;
    }

    @PutMapping
    @PreAuthorize("hasAnyAuthority('ADMIN', 'CUSTOMER')")
    public void Update(@RequestBody FurnitureDesignDTO dto){
        ModelMapper m = new ModelMapper();
        FurnitureDesign fd = m.map(dto, FurnitureDesign.class);
        fdS.insert(fd);
    }

    @GetMapping("/maderautilizada")
    @PreAuthorize("hasAnyAuthority('ADMIN')")
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

    @GetMapping("/contartipodemueble")
    @PreAuthorize("hasAnyAuthority('ADMIN')")
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
