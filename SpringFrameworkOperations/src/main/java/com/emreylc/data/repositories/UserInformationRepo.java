package com.emreylc.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emreylc.data.entities.UserInformation;

@Repository
public interface UserInformationRepo extends JpaRepository<UserInformation, Long> {

}