package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.Entity.Customer;
import com.example.Service.CustomerService;

public class CustomerController {
	@Autowired
	private CustomerService customerService;
	
	
	@PostMapping("/customer")
	public Customer addCustomer(@RequestBody Customer customer) {
		return this.customerService.addCustomer(customer);
	}
	
	@GetMapping("/customers")
	public List<Customer> getAllCustomer(){
		return this.customerService.getAllCustomer();
	}

}
