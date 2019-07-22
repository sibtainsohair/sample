package com.example.posttest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.xml.bind.ParseConversionEvent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
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
	public List<Customer> getcustomers() {
		List<Customer> customers = new ArrayList<>();
		cusrepo.findAll()
		.forEach(customers::add);
		return customers;
	}
	
	@RequestMapping("/customer/{id}")
	public Optional<Customer> getcustomer(@PathVariable String id) {
		int myid=Integer.parseInt(id);
		return cusrepo.findById(myid);
	}

}
