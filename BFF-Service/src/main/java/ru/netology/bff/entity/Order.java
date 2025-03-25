package ru.netology.bff.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    private Long   id;
    private Long   userId;
    private int    sum;
    private String currency;

    private OrderList orderList;
}