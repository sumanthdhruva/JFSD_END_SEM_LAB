package com.klef.jfsd.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klef.jfsd.exam.model.Customer;
import com.klef.jfsd.exam.service.CustomerService;

@RestController
@RequestMapping("customer")
public class CustomerController 
{
	@Autowired
	private CustomerService service;
	@GetMapping("/")
	public String home()
	{
		return "Spring Boot REST API JPA END SEM LAB EXAM";
	}
	@PostMapping("add")
	public String addcustomer(@RequestBody Customer c)
	{
		service.addcustomer(c);
		return "Customer added Successfully";	
	}
	@PutMapping("update")
	public String updatecustomer(@RequestBody Customer c)
	{
		return service.updatecustomer(c);
	}
}
