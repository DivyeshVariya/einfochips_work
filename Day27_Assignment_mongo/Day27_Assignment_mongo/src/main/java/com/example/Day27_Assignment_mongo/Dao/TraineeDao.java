package com.example.Day27_Assignment_mongo.Dao;

import java.util.List;
import java.util.Map;

import org.bson.Document;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.BasicQuery;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.Day27_Assignment_mongo.model.Trainee;

@Repository
public interface TraineeDao extends MongoRepository<Trainee,Integer>{
	
}
