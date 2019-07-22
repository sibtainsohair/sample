package com.example.posttest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerRepository cusrepo;
	
	@RequestMapping("/hi")
	public String hi() {
		return "hi";
	}
	
	@RequestMapping("/customers")
	public List<Customer> getcus() {
		List<Customer> customers = new ArrayList<>();
		cusrepo.findAll()
		.forEach(customers::add);
		return customers;
	}

}
