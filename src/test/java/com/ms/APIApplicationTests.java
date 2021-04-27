package com.ms;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

import com.ms.model.Users;
import com.ms.repo.IUsersRepo;

@RunWith(SpringRunner.class)
@SpringBootTest
public class APIApplicationTests {

	@Autowired
	private IUsersRepo repo;
	
	@Autowired
	private BCryptPasswordEncoder encoder;
	
	@Test
	public void crearUsuarioTest() {
		Users us = new Users();
		us.setId(4);
		us.setName("codex");
		us.setPassword(encoder.encode("123"));		
		Users retorno = repo.save(us);
		
		assertTrue(retorno.getPassword().equalsIgnoreCase(us.getPassword()));
	}

}
