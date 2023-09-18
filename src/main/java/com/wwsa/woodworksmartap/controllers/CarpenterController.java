package com.wwsa.woodworksmartap.controllers;

import com.wwsa.woodworksmartap.dtos.CarpenterDTO;
import com.wwsa.woodworksmartap.entities.Carpenter;
import com.wwsa.woodworksmartap.servicesinterfaces.CarpenterService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/carpenters")
public class CarpenterController {
    @Autowired
    private CarpenterService Cs;

    @PostMapping
    public void registrar(@RequestBody CarpenterDTO dto){
        ModelMapper m = new ModelMapper();
        Carpenter c = m.map(dto, Carpenter.class);
        Cs.insert(c);
    }

    @GetMapping
    public List<CarpenterDTO> Listar(){
        return Cs.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, CarpenterDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/id")
    public void eliminar(@PathVariable("id") Integer id){
        Cs.delete(id);
    }

    @GetMapping("/id")
    public CarpenterDTO ListarId(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        CarpenterDTO dto = m.map((Cs.listId(id)), CarpenterDTO.class);
        return dto;
    }

    @PutMapping
    public void Update(@RequestBody CarpenterDTO dto){
        ModelMapper m = new ModelMapper();
        Carpenter c = m.map(dto, Carpenter.class);
        Cs.insert(c);
    }
}
