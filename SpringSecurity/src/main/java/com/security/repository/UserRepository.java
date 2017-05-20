package com.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.security.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);
}