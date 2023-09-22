package com.wwsa.woodworksmartap.controllers;
import com.wwsa.woodworksmartap.dtos.CustomerDTO;
import com.wwsa.woodworksmartap.dtos.CustomerDniDTO;
import com.wwsa.woodworksmartap.entities.Customer;
import com.wwsa.woodworksmartap.servicesinterfaces.CustomerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    private CustomerService cMr;

    @PostMapping
    @PreAuthorize("hasAnyAuthority('ADMIN', 'CUSTOMER')")
    public void registrar(@RequestBody CustomerDTO dto){
        ModelMapper m = new ModelMapper();
        Customer c = m.map(dto, Customer.class);
        cMr.insert(c);
    }

    @GetMapping
    @PreAuthorize("hasAnyAuthority('ADMIN', 'CUSTOMER', 'CARPENTER')")
    public List<CustomerDTO> Listar(){
        return cMr.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, CustomerDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/id")
    @PreAuthorize("hasAnyAuthority('ADMIN')")
    public void eliminar(@PathVariable("id") Integer id){
        cMr.delete(id);
    }

    @GetMapping("/id")
    @PreAuthorize("hasAnyAuthority('ADMIN', 'CUSTOMER', 'CARPENTER')")
    public CustomerDTO ListarId(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        CustomerDTO dto = m.map((cMr.listId(id)), CustomerDTO.class);
        return dto;
    }

    @PutMapping
    @PreAuthorize("hasAnyAuthority('ADMIN', 'CUSTOMER')")
    public void Update(@RequestBody CustomerDTO dto){
        ModelMapper m = new ModelMapper();
        Customer c = m.map(dto, Customer.class);
        cMr.insert(c);
    }
    @GetMapping("/orders")
    @PreAuthorize("hasAnyAuthority('ADMIN')")
    public List<CustomerDniDTO> getCountOrderByDni() {
        List<String[]> countOrderByDni = cMr.CountOrderByDni();
        List<CustomerDniDTO> customerDniDTOList = new ArrayList<>();

        for (String[] data : countOrderByDni) {
            if (data.length >= 2) {
                CustomerDniDTO customerDniDTO = new CustomerDniDTO();
                customerDniDTO.setDni(Integer.parseInt(data[1]));
                customerDniDTO.setQuantityOrder(Integer.parseInt(data[1]));
                customerDniDTOList.add(customerDniDTO);
            }
        }

        return customerDniDTOList;
    }
}
