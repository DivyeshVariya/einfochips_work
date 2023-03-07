package com.practice21.Practiceday21.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

@RequestMapping("hi")
public String m1()
{
	return "hello spring world";
}
}
