package ru.netology.users.controller;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ru.netology.users.entity.User;
import ru.netology.users.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users/")
@RequiredArgsConstructor
public class UserController {
    private final UserRepository repository;

    @GetMapping("/{userId}")
    public Optional<User> getUser(@PathVariable Long userId) {
        return repository.findById(userId);
    }

    @GetMapping
    public List<User> getAllUsers() {
        return repository.findAll();
    }
}