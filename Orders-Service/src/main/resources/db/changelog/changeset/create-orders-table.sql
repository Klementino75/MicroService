-- liquibase formatted sql

-- changeset Author:create-orders-table

CREATE TABLE IF NOT EXISTS ORDERS (
    id bigserial PRIMARY KEY NOT NULL,
    user_Id bigint           NOT NULL,
    sum int                  NOT NULL,
    currency varchar(3)      NOT NULL,
    name varchar(100)        NOT NULL,
    quantity int             NOT NULL,
    cost int                 NOT NULL
    );