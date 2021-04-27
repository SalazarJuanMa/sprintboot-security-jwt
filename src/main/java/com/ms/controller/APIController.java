package com.ms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ms.model.Person;
import com.ms.repo.IPersonRepo;

@Controller
public class APIController {

	@Autowired
	private IPersonRepo repo;
	
	@GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        //logica 
		
		Person p = new Person();
		p.setIdPerson(2);
		p.setName("Code");
		repo.save(p);
		
		model.addAttribute("name", name);
        return "greeting";
    }
	
	@GetMapping("/listar")
    public String greeting(Model model) {
        //logica 							
		model.addAttribute("personas", repo.findAll());
        return "greeting";
    }
}
