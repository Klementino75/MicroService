package ru.netology.bff.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import ru.netology.orders.entity.Order;
import ru.netology.users.entity.User;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserData {
    private User user;
    private List<Order> orders;
}