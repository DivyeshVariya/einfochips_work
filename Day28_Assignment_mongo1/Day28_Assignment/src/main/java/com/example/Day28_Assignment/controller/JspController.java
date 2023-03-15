package com.example.Day28_Assignment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.Day28_Assignment.Dao.StudentDao;
import com.example.Day28_Assignment.model.Student;

@RestController
public class JspController {

	@Autowired
	StudentDao sd;
	@RequestMapping("/")
	public ModelAndView getIndex()
	{
		ModelAndView mv =new ModelAndView("index");
		sd.save(new Student(1,"Divyesh","surat","variya187@gmail.com","VGEC"));
		sd.save(new Student(2,"Akshat","ahmedabad","gandhi187@gmail.com","LJEC"));
		sd.save(new Student(3,"Jaydeep","Nadiyad","jaydeep187@gmail.com","SMT"));
		sd.save(new Student(4,"Jhanvi","ahmedabad","jhanvi187@gmail.com","VGEC"));
		sd.save(new Student(5,"Hani","bhavanagar","hani187@gmail.com","GECBV"));
		mv.addObject("data",sd.findAll());
		mv.addObject("aggregate",sd.getdata());
		return mv;
	}
}
