package com.niit.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HomeController {
	Logger logger=Logger.getLogger(HomeController.class);
	public HomeController(){
		logger.debug("CREATING INSTANCE FOR HOMECONTROLLER");
		System.out.println("CREATING INSTANCE FOR HOMECONTROLLER");
	}
	@RequestMapping("/home")
	public String home(){
		logger.debug("ENTERING HOME METHOD IN HOMECONTROLLER");
		return "home";
	}
	@RequestMapping("/aboutus")
	public String aboutUs(){
		logger.debug("ENTERING ABOUTUS METHOD IN HOMECONTROLLER");
		return"aboutus";
	}

}
