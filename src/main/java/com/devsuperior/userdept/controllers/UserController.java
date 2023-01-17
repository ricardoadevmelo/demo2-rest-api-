package com.devsuperior.userdept.controllers;

import com.devsuperior.userdept.entities.User;
import com.devsuperior.userdept.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping
    public List<User> usersList(){
        return repository.findAll();
    }

    @GetMapping(value = "/{id}")
    public List<User> findById(@PathVariable Long id){
            return repository.findAll();
    }

    @PostMapping
    public void salveUser(@RequestBody User user){
        repository.save(user);
    }

    @PutMapping
    public void changeUser(@RequestBody User user){
        repository.save(user);
    }

    @DeleteMapping
    public void deleteUser(@RequestBody User user){
        repository.delete(user);
    }




}
