package com.niit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HomeController {
	public HomeController(){
		System.out.println("CREATING INSTANCE FOR HOMECONTROLLER");
	}
	@RequestMapping("/Home")
	public String home(){
		return "Home";
	}
	@RequestMapping("/aboutus")
	public String aboutUs(){
		return"aboutus";
	}

}
