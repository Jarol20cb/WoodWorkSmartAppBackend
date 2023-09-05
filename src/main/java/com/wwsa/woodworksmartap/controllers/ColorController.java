package com.wwsa.woodworksmartap.controllers;

import com.wwsa.woodworksmartap.dtos.ColorDTO;
import com.wwsa.woodworksmartap.entities.Color;
import com.wwsa.woodworksmartap.servicesinterfaces.ColorService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/colors")
public class ColorController {
    @Autowired
    private ColorService Clor;

    @PostMapping
    public void registrar(@RequestBody ColorDTO dto){
        ModelMapper m = new ModelMapper();
        Color c = m.map(dto, Color.class);
        Clor.insert(c);
    }

    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<ColorDTO> Listar(){
        return Clor.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, ColorDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/id")
    public void eliminar(@PathVariable("id") Integer id){
        Clor.delete(id);
    }

    @GetMapping("/id")
    public ColorDTO ListarId(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        ColorDTO dto = m.map((Clor.listId(id)), ColorDTO.class);
        return dto;
    }

    @PutMapping
    public void Update(@RequestBody ColorDTO dto){
        ModelMapper m = new ModelMapper();
        Color c = m.map(dto, Color.class);
        Clor.insert(c);
    }



}
