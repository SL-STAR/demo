package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Hellocontroler {
    
	@ResponseBody
	@RequestMapping("/hello")
	public String hello() {
		return "hello";
	
	}
	@ResponseBody
	@RequestMapping("/")
	public String hello1() {
		return "hello1";
	
	}
}
