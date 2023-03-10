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

import jakarta.transaction.Transactional;

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
	
	@RequestMapping("updatemovie")
	public ModelAndView updatemoviename(@RequestParam("inputmovienameupdate") String inputmovienameupdate)
	{
		ModelAndView mv=new ModelAndView("updatemovie");
		List<Movie> li=md.findAll();
		for(Movie m :li)
		{
			if(m.getMoviename().equals(inputmovienameupdate))
			{
				mv.addObject("id",m.getMovieid());
				mv.addObject("name",m.getMoviename());
				mv.addObject("language",m.getLanguage());
				mv.addObject("director",m.getDirector());
				break;
			}
		}
		return mv;
	}
	
	@RequestMapping("updatedata")
	public ModelAndView updatedata(@RequestParam int mid,String mname,String language,String director)
	{
		ModelAndView mv=new ModelAndView("updatemovie");
		Movie flag=md.save(new Movie(mid,mname,language,director));
		if(flag.equals(null))
		{
			String msg="data not updated successfully...";
			mv.addObject("msg",msg);
			return mv;
			}
			else
			{
				String msg="data updated successfully...";
				mv.addObject("msg",msg);
				return mv;
			}
		}

	@RequestMapping("deletemoviepage")
	public ModelAndView deletemovienamepage()
	{
		return new ModelAndView("deletemovie");
	}
	
	@RequestMapping("deletemovie")
	@Transactional
	public ModelAndView deletemoviename(@RequestParam("inputmovienamedelete") String inputmovienamedelete)
	{
		ModelAndView mv=new ModelAndView("deletemovie");
		int flag=md.deleteBymoviename(inputmovienamedelete);
		if(flag==1)
		{
		String msg="data delete successfully...";
		mv.addObject("msg",msg);
		return mv;
		}
		else
		{
			String msg="data not delete successfully...";
			mv.addObject("msg",msg);
			return mv;
		}
		
	}
	
	@RequestMapping("viewbylanguage")
	public ModelAndView viewbylanguagepage(@RequestParam("lang") String lang)
	{
		ModelAndView mv=new ModelAndView("vewbyother");
		mv.addObject("lang",lang);
		List<Movie> li=md.findBylanguage(lang);
		System.out.println(li);
		mv.addObject("list",li);
		return mv;
	}

}
