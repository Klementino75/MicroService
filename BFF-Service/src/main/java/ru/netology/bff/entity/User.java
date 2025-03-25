package ru.netology.bff.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Long   id;
    private String fio;
    private String address;
    private String phone;
    private String email;
}