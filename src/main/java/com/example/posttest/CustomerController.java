package com.example.posttest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.xml.bind.ParseConversionEvent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	@CrossOrigin(origins = "*")
	public List<Customer> getcustomers() {
		List<Customer> customers = new ArrayList<>();
		cusrepo.findAll()
		.forEach(customers::add);
		return customers;
	}
	
	@RequestMapping("/customer/{id}")
	@CrossOrigin(origins = "*")
	public Optional<Customer> getcustomer(@PathVariable int id) {
		return cusrepo.findById(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/customer")
	@CrossOrigin(origins = "*")
	public void addcustomer(@RequestBody Customer customer) {
		cusrepo.save(customer);
	}

}
