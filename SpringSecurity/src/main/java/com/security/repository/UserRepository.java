package com.security.repository;

import org.springframework.data.repository.CrudRepository;

import com.security.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {

	User findByUsername(String username);

	User findById(long id);
}
