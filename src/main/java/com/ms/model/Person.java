package com.ms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {

	@Id
	private int idPerson;
	
	@Column(name = "name", length = 50)	
	private String name;

	public int getIdPerson() {
		return idPerson;
	}

	public void setIdPerson(int idPerson) {
		this.idPerson = idPerson;
	}

	public String getNanme() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
