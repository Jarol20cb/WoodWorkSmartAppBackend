package com.wwsa.woodworksmartap.controllers;

import com.wwsa.woodworksmartap.entities.Role;
import com.wwsa.woodworksmartap.entities.UsersAutorization;
import com.wwsa.woodworksmartap.repositories.IRolRepository;
import com.wwsa.woodworksmartap.repositories.IUserAtorizationRepository;
import com.wwsa.woodworksmartap.security.RegistrationRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;


//Controlador para insertar registro de usuario con sus roles, requiere del archivo RegistrationRequest
//y una pequeña modificadión en la carpeta WebSecurityConfig

//y para registrar en el Postman es de esta manera:
//{
//    "username": "jose",
//    "password": "jose",
//    "roles": ["CARPENTER"]
//}
@RestController
@CrossOrigin
public class UserRegistrerController {
    @Autowired
    private IUserAtorizationRepository userRepo;

    @Autowired
    private IRolRepository roleRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody RegistrationRequest registrationRequest) throws Exception {
        // Comprobar si el nombre de usuario ya existe
        if (userRepo.findByUsername(registrationRequest.getUsername()) != null) {
            throw new Exception("Username already exists");
        }

        // Crear nuevo usuario
        UsersAutorization newUser = new UsersAutorization();
        newUser.setUsername(registrationRequest.getUsername());
        newUser.setPassword(passwordEncoder.encode(registrationRequest.getPassword()));
        newUser.setEnabled(true);

        // Guardar usuario en la base de datos
        userRepo.save(newUser);

        // Crear y guardar roles para el usuario
        for (String roleName : registrationRequest.getRoles()) {
            Role newRole = new Role();
            newRole.setRol(roleName);
            newRole.setUser(newUser);
            roleRepo.save(newRole);
        }

        return ResponseEntity.ok("Usuario registrado con exito :)");
    }
}
