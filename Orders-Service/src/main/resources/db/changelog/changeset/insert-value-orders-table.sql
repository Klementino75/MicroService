-- liquibase formatted sql

-- changeset Author:insert-value-orders-table

INSERT INTO ORDERS VALUES(1, 1, 200, 'RUB', 'Молоко', 2, 100);
INSERT INTO ORDERS VALUES(2, 1, 150, 'RUB', 'Вода', 3, 50);
INSERT INTO ORDERS VALUES(3, 2, 200, 'RUB', 'Кофе', 1, 200);