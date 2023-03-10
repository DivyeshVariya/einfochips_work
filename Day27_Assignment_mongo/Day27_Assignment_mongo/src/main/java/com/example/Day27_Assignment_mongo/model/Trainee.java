package com.example.Day27_Assignment_mongo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
@Document
//(collection = "Trainee")
public class Trainee {

	@Id
//	@Field("trainee_id")
	private int trainee_id;
//	@Field("trainee_name")
	private String trainee_name;
//	@Field("trainee_from")
	private String trainee_from;
	public Trainee(int trainee_id, String trainee_name, String trainee_from) {
		super();
		this.trainee_id = trainee_id;
		this.trainee_name = trainee_name;
		this.trainee_from = trainee_from;
	}
	public int getTrainee_id() {
		return trainee_id;
	}
	public void setTrainee_id(int trainee_id) {
		this.trainee_id = trainee_id;
	}
	public String getTrainee_name() {
		return trainee_name;
	}
	public void setTrainee_name(String trainee_name) {
		this.trainee_name = trainee_name;
	}
	public String getTrainee_from() {
		return trainee_from;
	}
	public void setTrainee_from(String trainee_from) {
		this.trainee_from = trainee_from;
	}
	@Override
	public String toString() {
		return "Trainee [trainee_id=" + trainee_id + ", trainee_name=" + trainee_name + ", trainee_from=" + trainee_from
				+ "]";
	}
	public Trainee() {
		super();
	}

}
