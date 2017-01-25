package com.niit.pr;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class HelloWorld {
@RequestMapping("/hello")
public ModelAndView hello(){
	return new ModelAndView("welcome","message","Welcome to spring Mvcdemo ");
}
	@RequestMapping("/goodbye")
	public ModelAndView goodbye(){
		return new ModelAndView("welcome","message","Thank you ");
	}
}

