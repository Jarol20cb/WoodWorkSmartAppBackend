package com.wwsa.woodworksmartap.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUser;
    @Column(name = "UserFirstName", nullable = false, length = 40)
    private String UserFirstName;
    @Column(name = "UserLastName", nullable = false, length = 40)
    private String UserLastName;
    @Column(name = "Birthdate", nullable = false)
    private LocalDate Birthdate;
    @Column(name = "Address", nullable = false, length = 60)
    private String Address;
    @Column(name = "DNI", nullable = false, length = 20)
    private String DNI;
    @Column(name = "Email", nullable = false, length = 40)
    private String Email;
    @Column(name = "Number", nullable = false, length = 40)
    private String Number;

    public User() {}

    public User(int idUser, String userFirstName, String userLastName, LocalDate birthdate, String address, String DNI, String email, String number) {
        this.idUser = idUser;
        UserFirstName = userFirstName;
        UserLastName = userLastName;
        Birthdate = birthdate;
        Address = address;
        this.DNI = DNI;
        Email = email;
        Number = number;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getUserFirstName() {
        return UserFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        UserFirstName = userFirstName;
    }

    public String getUserLastName() {
        return UserLastName;
    }

    public void setUserLastName(String userLastName) {
        UserLastName = userLastName;
    }

    public LocalDate getBirthdate() {
        return Birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        Birthdate = birthdate;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }
}
