package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.Dao.UserDao;
import com.example.demo.model.User;

import jakarta.websocket.server.PathParam;

@RestController
public class JspController {
	@Autowired
	UserDao ud;
	
	@RequestMapping("index")
	public ModelAndView getindex()
	{
		ModelAndView mv=new ModelAndView("index");
		User u=new User(1,"Divyesh");
		ud.save(u);
		mv.addObject("data",u);
		return mv;
	}
	

	@GetMapping("/index/{id}")
	public String get(@PathVariable Integer id)
	{
		return ud.findById(id).toString();
	}
}
