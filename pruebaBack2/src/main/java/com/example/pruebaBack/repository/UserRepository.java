package com.example.pruebaBack.repository;

import com.example.pruebaBack.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findByNombre(String nombre);
}
