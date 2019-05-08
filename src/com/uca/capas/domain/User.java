package com.uca.capas.domain;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class User {
	@Size(message="La longitud no la soca",min=4,max=10)
	@NotEmpty(message="No puede estar vacio")
	String name;
	
	String username;
	
	@Size(message="La longitud no la soca x2",min=4,max=10)
	@NotEmpty(message="No puede estar vacio")
	String pass;
	
	public User(String name, String username, String pass) {
		super();
		this.name = name;
		this.username = username;
		this.pass = pass;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
}
