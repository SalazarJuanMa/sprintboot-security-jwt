package com.ms.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ms.model.Person;

public interface IPersonRepo extends JpaRepository<Person, Integer>{
	
}
