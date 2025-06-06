package ru.netology.orders.entity;

import jakarta.persistence.*;

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

    @Embedded
    private OrderList orderList;

    @Override
    public String toString() {
        return "'%d', '%d', '%s', %s".formatted(userId, sum, currency, orderList);
    }
}