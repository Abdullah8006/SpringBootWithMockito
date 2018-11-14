package com.abd.io.Springbootwithtesting;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LandingPageController {

	@RequestMapping(value = { "/", "/home" })
	public String home() {
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() {
		return "pages/aboutus";
	}
	
	@RequestMapping("/products")
	public String products() {
		return "pages/product";
	}
	
	@RequestMapping("/store")
	public String store() {
		return "pages/store";
	}
	
	@RequestMapping("/css-test")
	public String css() {
		return "pages/cssTest";
	}
	
}
