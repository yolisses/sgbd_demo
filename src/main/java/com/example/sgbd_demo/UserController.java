package com.example.sgbd_demo;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class UserController {
    private UserRepo userRepo;

    @GetMapping("/users")
    public List<User> all() {
        return userRepo.findAll();
    }
}
