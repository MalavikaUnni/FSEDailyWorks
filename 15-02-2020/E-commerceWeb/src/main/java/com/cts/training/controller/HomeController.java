package com.cts.training.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	
	@GetMapping("/index")
	public String indexPage() {
		return "index";
	}

	
	
	
	@GetMapping("/admin")
	public String adminPage() {
		return "admin";
	}

	@GetMapping("/user")
	public String userPage() {
		return "employee";
	}

	
	@GetMapping("/")
	public String homePage() {
		return "home";
	}
	
	
	
//	@GetMapping("/ProductView")
//	public String productPage() {
//		return "ProductView";
//	}
//
//	@GetMapping("/SupplierView")
//	public String supplierPage() {
//		return "hr";
//	}
//
//	@GetMapping("/UserView")
//	public String userPage() {
//		return "UserView";
//	}
//	
//	
//	@GetMapping("/CategoryView")
//	public String categoryPage() {
//		return "CategoryView";
//	}
	
}
