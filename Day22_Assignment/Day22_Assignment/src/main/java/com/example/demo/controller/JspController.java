package com.example.demo.controller;

import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.jdbc.PersonDao;
import com.example.demo.model.Person;

@Controller
public class JspController {

	@RequestMapping("home")
	public ModelAndView getHome()
	{
		return new ModelAndView("home");
	}
	
	@GetMapping("feedback")
	public ModelAndView getFeedback()
	{
		return new ModelAndView("feedback");
	}
	
	@GetMapping("adddata")
	public ModelAndView insertToDb(@RequestParam String name,String email,String msg) throws SQLException
	{
		PersonDao pd=new PersonDao();
		Person p=new Person(name,email,msg);
		pd.DBInsert(p);
		return new ModelAndView("home");
	}
}
