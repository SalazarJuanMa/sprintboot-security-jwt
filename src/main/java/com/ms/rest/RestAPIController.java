package com.ms.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ms.model.Person;
import com.ms.repo.IPersonRepo;

@RestController
@RequestMapping("/persons")
public class RestAPIController {

	@Autowired
	private IPersonRepo repo;
	
	@GetMapping
	public List<Person> getPersons(){
		return repo.findAll();
	}

	@PostMapping
	public void addPerson(@RequestBody Person per){
		repo.save(per);
	}
	
	@PutMapping
	public void updatePerson(@RequestBody Person per){
		repo.save(per);
	}
	
	@DeleteMapping(value = "/{id}")
	public void deletePerson(@PathVariable("id") Integer id) {
		repo.deleteById(id);
	}

}
