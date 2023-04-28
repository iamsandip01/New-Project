package com.example.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Entity.Customer;

@Service
public interface CustomerService {
	public Customer addCustomer(Customer customer);
	public List<Customer> getAllCustomer();
	
}
