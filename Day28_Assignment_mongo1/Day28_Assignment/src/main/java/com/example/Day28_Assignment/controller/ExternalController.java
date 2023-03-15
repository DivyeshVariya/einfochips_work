package com.example.Day28_Assignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.Day28_Assignment.Dao.StudentDao;
import com.example.Day28_Assignment.model.Student;

@RestController
public class ExternalController{

	@Autowired
	StudentDao sd;
	
	@GetMapping("externalStudent")
	public List<Student> getexternal()
	{
		return sd.findAll();
	}
}
