package com.example.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.Entity.Customer;
import com.example.Service.CustomerService;
import com.example.repo.CustomerRepo;

public class CustomerServiceImpl implements CustomerService{

	@Autowired
	CustomerRepo customerRepo;
	
	
	@Override
	public Customer addCustomer(Customer customer) {
		
		return customerRepo.save(customer);
	}

	@Override
	public List<Customer> getAllCustomer() {
		
		return customerRepo.findAll();
	}

}
