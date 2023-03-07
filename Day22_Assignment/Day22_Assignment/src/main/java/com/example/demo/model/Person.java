package com.example.demo.model;

public class Person {
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
public String getMsg() {
	return msg;
}
public void setMsg(String msg) {
	this.msg = msg;
}
public Person(String name, String email, String msg) {
	super();
	this.name = name;
	this.email = email;
	this.msg = msg;
}
private String email;
private String msg;
}
