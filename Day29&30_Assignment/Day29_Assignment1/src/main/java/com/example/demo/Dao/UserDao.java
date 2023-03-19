package com.example.demo.Dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.User;

public interface UserDao extends MongoRepository<User, Integer>{

}
