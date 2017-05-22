package com.security.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.security.domain.Item;
import com.security.domain.User;
import com.security.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService, UserDetailsService {

	private final UserRepository userRepository;

	@Autowired
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public void addUser(User user) {
		userRepository.save(user);
	}

	@Override
	public Iterable<User> getUsers() {
		return userRepository.findAll();
	}

	@Override
	public List<String> getUsernames() {
		List<String> usernames = new ArrayList<String>();
		Iterator<?> iterator = getUsers().iterator();

		while (iterator.hasNext()) {
			User user = (User) iterator.next();
			usernames.add(user.getUsername());

		}
		return usernames;
	}

	@Override
	public User getUserByUsername(String username) {
		return userRepository.findByUsername(username);
	}

	@Override
	public User getUserById(long id) {
		return userRepository.findById(id);
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = getUserByUsername(username);

		if (user == null) {
			throw new UsernameNotFoundException("User with username: " + username + " not found. ");
		} else {
			return user;
		}
	}

	@Override
	public Set<Item> getUserOfItems(long userId) {
		return getUserById(userId).getItems();
	}

}
