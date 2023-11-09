package com.rakesh.studentMicroService.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class viewcontroller {

	@GetMapping("/index")
	public String index() {
		return "index";
	}
	
}
