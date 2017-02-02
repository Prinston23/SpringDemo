package com.niit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.service.*;
import com.niit.model.Product;
@Controller
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	public ProductController(){
		System.out.println("CREATING INSTANCE FOR PRODUCTCONTROLLER");
	}
	
	@RequestMapping("/admin/product/productform")
  public String getProductForm(Model model){
	model.addAttribute("product",new Product());
	  return "productform";
	  
  }
	@RequestMapping("/admin/product/addproduct")
	public ModelAndView saveProduct(@ModelAttribute(value="product")Product product){
	
		Product newProduct=productService.saveProduct(product);
		return new ModelAndView("productlist","product",newProduct);
		
	}

}
