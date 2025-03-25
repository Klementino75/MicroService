package ru.netology.orders.controller;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ru.netology.orders.entity.Order;
import ru.netology.orders.repository.OrderRepository;

import java.util.List;

@RestController
@RequestMapping("/api/orders/by-user/")
@RequiredArgsConstructor
public class OrderController {
    private final OrderRepository repository;

    @GetMapping("/{user}")
    public List<Order> getOrderByUser(@PathVariable Long user) {
        return repository.findByUserId(user);
    }

    @GetMapping
    public List<Order> getAllOrders() {
        return repository.findAll();
    }
}