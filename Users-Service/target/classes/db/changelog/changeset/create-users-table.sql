-- liquibase formatted sql

-- changeset Author:create-users-table

CREATE TABLE IF NOT EXISTS USERS (
    id bigserial PRIMARY KEY NOT NULL,
    fio varchar(255)         NOT NULL,
    address varchar(255)     NOT NULL,
    phone varchar(20)        NOT NULL,
    email varchar(255)       NOT NULL
    );