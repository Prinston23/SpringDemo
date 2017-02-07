package com.niit.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.service.*;
import com.niit.model.Product;
@Controller
public class ProductController {
	
	@Autowired
	private ProductService productService;
	@Autowired
	private CategoryService categoryService;
	
	public ProductController(){
		System.out.println("CREATING INSTANCE FOR PRODUCTCONTROLLER");
	}
	
	@RequestMapping("/admin/product/productform")
public String getProductForm(Model model){
		model.addAttribute("product",new Product());
		model.addAttribute("categories",categoryService.getCategories());
	return "productform";
}
@RequestMapping("/admin/product/addProduct")
public String addProduct(@Valid @ModelAttribute("product") Product product,BindingResult result){
	if(result.hasErrors())
		return "productform";
	System.out.println("PRODUCT " + product.getName() + " " + product.getDescription() + " " + product.getPrice());
	productService.saveProduct(product);
	return "";
}
}
