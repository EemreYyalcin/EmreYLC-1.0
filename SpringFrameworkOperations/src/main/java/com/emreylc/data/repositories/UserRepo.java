package com.emreylc.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emreylc.data.entities.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

	public User findByUserNameLikeAndPasswordLike(String userName, String password);
	
}
