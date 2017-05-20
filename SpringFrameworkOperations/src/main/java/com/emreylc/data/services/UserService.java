package com.emreylc.data.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emreylc.data.repositories.UserRepo;

@Service
public class UserService {

	@Autowired
	private UserRepo userRepo;

	public UserRepo getUserRepo() {
		return userRepo;
	}

	public void setUserRepo(UserRepo userRepo) {
		this.userRepo = userRepo;
	}
}
