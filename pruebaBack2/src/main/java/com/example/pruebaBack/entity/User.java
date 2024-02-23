package com.example.pruebaBack.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "userPrueba")
public class User {
    @Id
    @GeneratedValue
    private int id;
    private String nombre;
    private String correo;
    private String telefono;
}
