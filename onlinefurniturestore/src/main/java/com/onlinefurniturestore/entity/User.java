package com.onlinefurniturestore.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name="UserManagement")
public class User {
	
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "uid")
	private int uId;
	//Bean validation to check the validity and number of characters in the username
	@Pattern(regexp = "[a-zA-Z] {1-20}$" , message = "name must have alphabets" )
	@Size(max = 20 , message = "username should be less than 20 characters")
	@Column(name = "username", nullable = false)
	private String username;

	//Bean validation to check the validity and number of characters in the password
	@Pattern(regexp = "[a-zA-Z0-9@#&*_] {1-20}$" , message = "name must have alphabets" )
	@Size(max = 10 , message = "password should be less than 10 characters")
	@Column(name = "password", nullable = false)
	private String password;

	@Column(name = "role", nullable = false)
	private String role;

	public User() {
		super();
	}

	public User(int uId, String password, String role, String username) {
		super();
		this.uId = uId;
		this.username = username;
		this.password = password;
		this.role = role;
	}

	public int getUId() {
		return uId;
	}

	public void setUId(int uId) {
		this.uId = uId;
	}

	public String getPassword() {
		return password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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

	@Override
	public String toString() {
		return "User [uId=" + uId + ", password=" + password + ", role=" + role + "]";
	}


}
