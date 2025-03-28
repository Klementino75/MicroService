package ru.netology.users.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import ru.netology.users.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {}