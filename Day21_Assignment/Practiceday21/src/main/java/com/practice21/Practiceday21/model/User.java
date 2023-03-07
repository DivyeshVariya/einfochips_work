package com.practice21.Practiceday21.model;

public class User {

	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	private String email;
	private String dob;
	private String password;
	public User(String name, String email, String dob, String password) {
		super();
		this.name = name;
		this.email = email;
		this.dob = dob;
		this.password = password;
	}
	
}
