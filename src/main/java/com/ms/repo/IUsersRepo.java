package com.ms.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ms.model.Users;

public interface IUsersRepo extends JpaRepository<Users, Integer>{
	
	Users findByName(String name);
}
