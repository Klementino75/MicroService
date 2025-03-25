package ru.netology.orders.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class OrderList {
    @Column(name = "name", length = 100, nullable = false)
    private String name;
    @Column(name = "quantity", nullable = false)
    private int quantity;
    @Column(name = "cost", nullable = false)
    private int cost;

    @Override
    public String toString() {
        return "'%s', '%d', '%d'".formatted(name, quantity, cost);
    }
}