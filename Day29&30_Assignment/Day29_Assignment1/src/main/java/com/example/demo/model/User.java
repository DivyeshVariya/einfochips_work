package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User {
@Id
private int id;
private String Name;
public User(int id, String name) {
	super();
	this.id = id;
	this.Name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
@Override
public String toString() {
	return "User [id=" + id + ", Name=" + Name + "]";
}

}
