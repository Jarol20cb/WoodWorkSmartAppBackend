package com.wwsa.woodworksmartap.controllers;

import com.wwsa.woodworksmartap.dtos.QualificationDTO;
import com.wwsa.woodworksmartap.entities.Qualification;
import com.wwsa.woodworksmartap.servicesinterfaces.QualificationService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/qualifications")
public class QualificationController {
    @Autowired
    private QualificationService qL;

    @PostMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void registrar(@RequestBody QualificationDTO dto){
        ModelMapper m = new ModelMapper();
        Qualification c = m.map(dto, Qualification.class);
        qL.insert(c);
    }
    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<QualificationDTO> Listar()
    {
        return qL.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,QualificationDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        qL.delete(id);
    }

    @GetMapping("/{id}")
    public QualificationDTO ListarId(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        QualificationDTO dto = m.map((qL.listId(id)),QualificationDTO.class);
        return dto;
    }

    @PutMapping
    public void Update(@RequestBody QualificationDTO dto){
        ModelMapper m = new ModelMapper();
        Qualification c = m.map(dto, Qualification.class);
        qL.insert(c);
    }
}
