package com.security.service;

import java.util.List;
import java.util.Set;

import com.security.domain.Item;
import com.security.domain.User;

public interface UserService {

	void addUser(User user);

	Iterable<User> getUsers();

	List<String> getUsernames();

	User getUserByUsername(String username);

	User getUserById(long id);

	Set<Item> getUserOfItems(long userId);

}
