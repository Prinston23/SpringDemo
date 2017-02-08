package com.niit.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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

	public ProductController() {
		System.out.println("CREATING INSTANCE FOR PRODUCTCONTROLLER");
	}
	@RequestMapping("/admin/product/productform")
	public String getProductForm(Model model){
		//Product product = new Product();
		model.addAttribute("product",new Product());
		model.addAttribute("categories",categoryService.getCategories());
		return "productform";
	}

	@RequestMapping("/admin/product/addProduct")
	public String saveProduct(
			@Valid @ModelAttribute(value = "product") Product product,
			BindingResult result) {
		if (result.hasErrors())
			return "productform";
	Product newProduct=productService.saveProduct(product);
		return "redirect:/all/product/getAllProducts";

	}

	@RequestMapping("/all/product/getAllProducts")
	public String getAllProducts(Model model) {
		List<Product> products = productService.getAllProducts();
		// Assigning list of products to model attribute products
		model.addAttribute("productList", products);
		return "productlist";
	}

	@RequestMapping("/all/product/viewproduct/{id}")
	public String viewProduct(@PathVariable int id, Model model) {
		Product product = productService.getProductById(id);
		model.addAttribute("product", product);
		return "viewproduct";
	}
}