package com.example.pruebaBack.service;

import com.example.pruebaBack.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.pruebaBack.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public User saveUser(User user){
        return repository.save(user);
    }

    public List<User> saveUsers(List<User> user){
        return repository.saveAll(user);
    }

    public List<User> getUsers(){
        return repository.findAll();
    }

    public User getUserByIdUser(int id){
        return repository.findById(id).orElse(null);
    }

    public User getUserByName(String nombre){
        return repository.findByNombre(nombre);
    }

    public String deleteUser(int id){
        repository.deleteById(id);
        return "product removed " + id;
    }

    public User updateUser(User user){
        User existingUser = repository.findById(user.getId()).orElse(null);
        existingUser.setNombre(user.getNombre());
        existingUser.setCorreo(user.getCorreo());
        existingUser.setTelefono(user.getTelefono());
        return repository.save(existingUser);
    }

}
