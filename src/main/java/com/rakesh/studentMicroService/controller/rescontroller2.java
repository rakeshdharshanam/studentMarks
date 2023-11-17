package com.rakesh.studentMicroService.controller;

import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Profile("test")
public class rescontroller2 {

	@RequestMapping("/hello")
	public String hello(){
		return "test profile hello";
		
	}
}
