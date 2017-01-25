package com.niit.pr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
	
	
	@RequestMapping({"/hello","/"})
	public ModelAndView hello()
	{
		return new ModelAndView("welcome","message","Welcome to sprig mvc demo");
	}
	@RequestMapping("/goodbye")
    public ModelAndView goodbye(){
    	return new ModelAndView("welcome","message","Thank you for visiting");
    }
	
}
