package ru.netology.bff.controller;

import ru.netology.bff.entity.UserData;
import ru.netology.bff.service.BffService;

import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/site-bff/user")
@RequiredArgsConstructor
public class BffController {
    private final BffService bffService;

    @GetMapping("/{userId}")
    public ResponseEntity<UserData> getUserData(@PathVariable Long userId) {
        return bffService.getUserData(userId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}