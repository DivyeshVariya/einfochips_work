package com.example.Day27_Assignment_mongo.controller;

import java.util.ArrayList;

import java.util.List;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.Day27_Assignment_mongo.Dao.TraineeDao;
import com.example.Day27_Assignment_mongo.model.Trainee;
import com.mongodb.client.MongoCollection;

@RestController
@CrossOrigin
public class JspController {

	@Autowired
	TraineeDao td;
	
@RequestMapping("/")
public ModelAndView gethome() {
	ModelAndView mv=new ModelAndView("home");
	return mv;
}


@RequestMapping("/insert")
public ModelAndView insert(@RequestParam int id,String name,String from) {
	ModelAndView mv=new ModelAndView("home");
	Trainee t=td.save(new Trainee(id,name,from));
	if(t.equals(null))
	{
		mv.addObject("msg","data not inserted into db....");
	}
	else
	{
		mv.addObject("msg","data inserted into db....");
	}
	return mv;
}


@RequestMapping("/delete")
public ModelAndView delete(@RequestParam int id) {
	ModelAndView mv=new ModelAndView("viewdata");
	if(!String.valueOf(id).equals(null)&&!td.findById(id).isEmpty())
	{
	td.deleteById(id);
	mv.addObject("msg","data deleted from db....");
	}
	else
	{
		mv.addObject("msg","data not deleted from db....");
	}
	List<Trainee> li=td.findAll();
	mv.addObject("data",li);
	mv.addObject("count",td.count());
	
	return mv;
	}

@RequestMapping("/viewdata")
public ModelAndView viewdata() {
	ModelAndView mv=new ModelAndView("viewdata");
	
	List<Trainee> li=td.findAll();
	mv.addObject("data",li);
	mv.addObject("count",td.count());
	return mv;
	}
@RequestMapping("/fatch")
public List<Trainee> fatch(){
	List<Trainee> li=td.findAll();
	return li;
}

}
