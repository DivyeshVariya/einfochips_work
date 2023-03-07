package com.practice21.Practiceday21.controller;

import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.practice21.Practiceday21.jdbc.UserDao;
import com.practice21.Practiceday21.model.User;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class JspController {
@RequestMapping("index")
public String jsp1() {
	return "index.jsp";
}

@RequestMapping("register")
public String register() {
	return "registration.jsp";
}

@RequestMapping("login")
public ModelAndView login() {
	return new ModelAndView("loginpage.jsp");
}


@RequestMapping("adddata")
public String insertTODB(HttpServletRequest req) {
	System.out.println("Name :"+req.getParameter("uname"));
	System.out.println("Email :"+req.getParameter("email"));
	System.out.println("Date of Birth :"+ req.getParameter("dob"));
	System.out.println("Password :"+req.getParameter("Pass"));
	System.out.println("Confirm Password :"+req.getParameter("ConfPass"));
	return req.getParameter("uname");
}

@RequestMapping("adddata1")
public ModelAndView passToother(HttpServletRequest req) throws SQLException {
	ModelAndView mv=new ModelAndView("viewRegisterData.jsp");
	String name=req.getParameter("uname");
	String email=req.getParameter("email");
	String dob=req.getParameter("dob");
	String Pass=req.getParameter("Pass");
	String ConfPass=req.getParameter("ConfPass");
	User u=new User(name,email,dob,Pass);
	UserDao ud= new UserDao();
	ud.registrationDBInsert(u);
	if(!name.equals("")&&!email.equals("")&&!dob.equals("")&&!Pass.equals("")&&!ConfPass.equals(""))
	{
		mv.addObject("val1",name);
		mv.addObject("val2",email);
		mv.addObject("val3",dob);
		mv.addObject("val4",Pass);
		mv.addObject("val5",ConfPass);
	}
	else
	{
		mv.addObject("val1",name);
		mv.addObject("val2",email);
		mv.addObject("val3",dob);
		mv.addObject("val4",Pass);
		mv.addObject("val5",ConfPass);
	}
	return mv;
}

@RequestMapping("logindata")
public ModelAndView checklogindata(HttpServletRequest req) throws SQLException {
	ModelAndView mv=new ModelAndView("DashBoard.jsp");
	String name=req.getParameter("username");
	String pass=req.getParameter("pass");
	UserDao ud= new UserDao();
	boolean flag=ud.fetchUsernamePassword(name, pass);
	if(flag)
	{
	return mv;
	}
	else
	{
	return new ModelAndView("loginpage.jsp");
	}
}

@RequestMapping("backTohome")
public String backtohome() {
	return "index.jsp";
}

}

