package com.SpringBoot.ZonionApplication.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity									//represent its a Entity class
public class Admin {
	
	 @Id									//create id as primary key
	 @GeneratedValue                    //set auto increment value to primary key id
	private int id;
	private String username;
	private String password;
	private String role;
	
	
	//Default Constructor
	public Admin() {
		super();
		
	}
	
	//Parameterized Constructor
	public Admin(int id, String username, String password, String role) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.role = role;
	}

	//Setter and getters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}



	//toString method
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", role=" + role + "]";
	}


	

}


