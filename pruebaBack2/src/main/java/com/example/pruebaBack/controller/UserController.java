package com.example.pruebaBack.controller;

import com.example.pruebaBack.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.pruebaBack.entity.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService service;

    @PostMapping("/addUser")
    public User addUser(@RequestBody User user){
        return service.saveUser(user);
    }

    @PostMapping("/addUsers")
    public List<User>  addUsers(@RequestBody List<User> user){
        return service.saveUsers(user);
    }

    @GetMapping("/users")
    public List<User> findAllUsers(){
        return service.getUsers();
    }

    @GetMapping("/userById/{id}")
    public User findUserById(@PathVariable int id){
        return service.getUserByIdUser(id);
    }

    @GetMapping("/userByNombre/{nombre}")
    public User findUserName(@PathVariable String nombre){
        return service.getUserByName(nombre);
    }

    @PutMapping("/update")
    public User updateUser(@RequestBody User user){
        return service.updateUser(user);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable int id){
        return service.deleteUser(id);
    }


}
