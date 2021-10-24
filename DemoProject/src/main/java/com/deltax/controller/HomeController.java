package com.deltax.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String landingPage() {
		return"index";
	}
	@RequestMapping("/aboutpage")
	public String aboutPage() {
		return"about";
	}
	
	@RequestMapping("/contactpage")
	public String contactage() {
		return"contact";
	}
	
	@RequestMapping("/processform")
	public String process() {
		return"contact.html";
	}
	@RequestMapping("/login")
	public String login() {
		return"Login.html";
	}
}
