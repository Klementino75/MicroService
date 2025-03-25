package ru.netology.orders.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "orders")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Order {
    @Id
    private Long id;
    @Column(name = "userId", nullable = false)
    private Long userId;
    @Column(name = "sum", nullable = false)
    private int sum;
    @Column(name = "currency", length = 3, nullable = false)
    private String currency;

    @Column(name = "name", length = 100, nullable = false)
    private String name;
    @Column(name = "quantity", nullable = false)
    private int quantity;
    @Column(name = "cost", nullable = false)
    private int cost;

    @Override
    public String toString() {
        return "'%d', '%d', '%s', '%s', '%d', '%d'".formatted(userId, sum, currency, name, quantity, cost);
    }
}