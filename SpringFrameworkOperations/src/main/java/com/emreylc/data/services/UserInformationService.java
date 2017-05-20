package com.emreylc.data.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emreylc.data.repositories.UserInformationRepo;

@Service
public class UserInformationService {

	@Autowired
	private UserInformationRepo userInformationRepo;

	public UserInformationRepo getUserInformationRepo() {
		return userInformationRepo;
	}

	public void setUserInformationRepo(UserInformationRepo userInformationRepo) {
		this.userInformationRepo = userInformationRepo;
	}
}
