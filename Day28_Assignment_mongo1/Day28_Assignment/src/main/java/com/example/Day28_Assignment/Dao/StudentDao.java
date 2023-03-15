package com.example.Day28_Assignment.Dao;

import java.util.List;

import org.bson.Document;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.Day28_Assignment.model.Student;

public interface StudentDao extends MongoRepository<Student, Integer>{
@Aggregation(pipeline= {"{'$match':{'student_Cityfrom':'ahmedabad'}}","{'$count':'count'}"})
Long getdata();
}
