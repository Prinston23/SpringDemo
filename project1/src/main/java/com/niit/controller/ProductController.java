package com.niit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.model.Product;
@Controller
public class ProductController {
	@RequestMapping("/productform")
  public String getProductForm(Model model){
	model.addAttribute("product",new Product());
	  return "productform";
	  
  }
	@RequestMapping("/addproduct")
	public ModelAndView saveProduct(@ModelAttribute(value="product")Product product){
		return null;
		
	}

}
