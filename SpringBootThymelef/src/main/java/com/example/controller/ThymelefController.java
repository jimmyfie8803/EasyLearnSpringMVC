package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThymelefController {

	@GetMapping("/hello")
	public String main(Model model) {
	
		model.addAttribute("message", "HelloWorld!!!!!!");

		return "hello";
	}

}
