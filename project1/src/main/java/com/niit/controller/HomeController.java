package com.niit.controller;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.service.CategoryService;
@Controller
public class HomeController {
	private CategoryService categoryservice;
	Logger logger=Logger.getLogger(HomeController.class);
	public HomeController(){
		logger.debug("CREATING INSTANCE FOR HOMECONTROLLER");
		System.out.println("CREATING INSTANCE FOR HOMECONTROLLER");
	}
	@RequestMapping("/home")
	public String home(){
		//session.setAttribute("categories", categoryservice.getCategories());
		logger.debug("ENTERING HOME METHOD IN HOMECONTROLLER");
		return "home";
	}
	@RequestMapping("/aboutus")
	public String aboutUs(){
		logger.debug("ENTERING ABOUTUS METHOD IN HOMECONTROLLER");
		return"aboutus";
	}
	@RequestMapping("/login")
	public String login(){	
		return "login";
	}
}