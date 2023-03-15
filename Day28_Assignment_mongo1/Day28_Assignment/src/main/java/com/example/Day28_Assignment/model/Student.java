package com.example.Day28_Assignment.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Student {
@Id
private int student_Id;
private String student_Name;
private String student_Cityfrom;
private String student_email;
private String student_college;
public Student(int student_Id, String student_Name, String student_Cityfrom, String student_email,
		String student_college) {
	super();
	this.student_Id = student_Id;
	this.student_Name = student_Name;
	this.student_Cityfrom = student_Cityfrom;
	this.student_email = student_email;
	this.student_college = student_college;
}
@Override
public String toString() {
	return "Student [student_Id=" + student_Id + ", student_Name=" + student_Name + ", student_Cityfrom="
			+ student_Cityfrom + ", student_email=" + student_email + ", student_college=" + student_college + "]";
}
public int getStudent_Id() {
	return student_Id;
}
public void setStudent_Id(int student_Id) {
	this.student_Id = student_Id;
}
public String getStudent_Name() {
	return student_Name;
}
public void setStudent_Name(String student_Name) {
	this.student_Name = student_Name;
}
public String getStudent_Cityfrom() {
	return student_Cityfrom;
}
public void setStudent_Cityfrom(String student_Cityfrom) {
	this.student_Cityfrom = student_Cityfrom;
}
public String getStudent_email() {
	return student_email;
}
public void setStudent_email(String student_email) {
	this.student_email = student_email;
}
public String getStudent_college() {
	return student_college;
}
public void setStudent_college(String student_college) {
	this.student_college = student_college;
}

}
