package com.security.services;

import com.security.domain.User;

public interface UserService {

	void save(User user);

	User findByUsername(String username);

}
