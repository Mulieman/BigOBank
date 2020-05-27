package com.bank.bigobank.controller;

import com.bank.bigobank.domain.User;
import com.bank.bigobank.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;
    Logger log = LoggerFactory.getLogger(UserController.class);

    @GetMapping
    public ResponseEntity<List<User>> getAllUser(){

       return ResponseEntity.ok().body(userService.getAllUser().orElse(null));
    }
    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id){
        return ResponseEntity.ok().body(userService.getUserById(id).orElse(null));
    }
    @DeleteMapping("/{id}")
        public ResponseEntity<String> deleteUser(@PathVariable Long id){
        userService.delete(id);

        return ResponseEntity.ok().body("Done!");
    }

    @PostMapping
    public ResponseEntity<User> create(@RequestBody User user){
       return ResponseEntity.ok().body(userService.create(user));
    }

    @PutMapping
    public ResponseEntity<User> update(@RequestBody User user){
       return ResponseEntity.ok().body(userService.update(user));
    }



}
