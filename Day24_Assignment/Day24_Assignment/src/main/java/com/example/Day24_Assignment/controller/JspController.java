package com.example.Day24_Assignment.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.Day24_Assignment.Dao.MovieDao;
import com.example.Day24_Assignment.model.Movie;

@RestController
public class JspController {
	
	@Autowired
	MovieDao md;
	
	
	@RequestMapping("/")
	public ModelAndView getHome()
	{
		return new ModelAndView("home");
	}
	
	@RequestMapping("addmovie")
	public ModelAndView getaddmovie()
	{
		return new ModelAndView("addmovie");
	}
	
	@RequestMapping("/adddata")
	public ModelAndView adddatatodb(@RequestParam String mname,String language,String mdirector)
	{
		ModelAndView mv=new ModelAndView("view_data");
		Movie m=new Movie(3,mname,language,mdirector);
		System.out.println(m);
		md.save(m);
		
//		mv.addObject("val1",mid);
		mv.addObject("val2",mname);
		mv.addObject("val3",language);
		mv.addObject("val4",mdirector);
		
		return mv;
	}

	@RequestMapping("viewall")
	public ModelAndView getall()
	{
		ModelAndView mv=new ModelAndView("viewall");
		List<Movie> li=md.findAll();
		mv.addObject("list",li);
		Optional<Movie> li1=md.findBymoviename("kjs");
		mv.addObject("list1",li1);
		return mv;
	}
	
	@RequestMapping("updatemoviepage")
	public ModelAndView updatemovienamepage()
	{
		return new ModelAndView("updatemovie");
	}
	

	@RequestMapping("deletemoviepage")
	public ModelAndView deletemovienamepage()
	{
		return new ModelAndView("deletemovie");
	}
	
	@RequestMapping("deletemovie")
	public ModelAndView deletemoviename(@RequestParam String inputmovienamedelete)
	{
		ModelAndView mv=new ModelAndView("home");
		md.deleteBymoviename(inputmovienamedelete);
		String msg="data delete successfully...";
		mv.addObject("msg",msg);
		return mv;
		
	}

}
