package com.UST.UstempregistrationService.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.UST.UstempregistrationService.model.User;

public interface UserRepository extends JpaRepository<User,Integer >{
	List<User>findByEmail(String email);

}
