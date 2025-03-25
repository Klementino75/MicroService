package ru.netology.bff.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    private Long   id;
    private Long   userId;
    private int    sum;
    private String currency;

    private String name;
    private int    quantity;
    private int    cost;

//    private List<OrderList> orderList;
}