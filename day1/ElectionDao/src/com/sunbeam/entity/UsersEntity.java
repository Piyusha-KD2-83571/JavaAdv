package com.sunbeam.entity;

import java.time.LocalDate;

public class UsersEntity {
    
	private int id;
	private String f_name;
	private String l_name;
	private String email;
	private String password;
	private LocalDate birthdate;
	
	//Constructor
	public UsersEntity(String f_name, String l_name, String email, String password, LocalDate birthdate) {
		super();
		this.id = id;
		this.f_name = f_name;
		this.l_name = l_name;
		this.email = email;
		this.password = password;
		this.birthdate = birthdate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getF_name() {
		return f_name;
	}

	public void setF_name(String f_name) {
		this.f_name = f_name;
	}

	public String getL_name() {
		return l_name;
	}

	public void setL_name(String l_name) {
		this.l_name = l_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LocalDate getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}

	@Override
	public String toString() {
		return "UsersEntity [id=" + id + ", f_name=" + f_name + ", l_name=" + l_name + ", email=" + email
				+ ", password=" + password + ", birthdate=" + birthdate + "]";
	}

	
	
	
	
	
	
}
