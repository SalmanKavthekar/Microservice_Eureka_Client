package com.eureka.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/employee")
public class EmployeeController {
	
	@GetMapping("/list")
	public List<String> getEmployeeList(){
		List<String> list=new ArrayList<>();
		list.add("Salman");
		list.add("Samir");
		return list;
	}

}
