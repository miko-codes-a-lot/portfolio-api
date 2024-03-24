package com.codecrafters.portfolioapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codecrafters.portfolioapi.model.entity.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}