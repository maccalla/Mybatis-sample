package com.mksai.springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CustomerSelectCustomerService {

	@Autowired
	CustomerRepository customerRepository;
	
	//Validation
	
	public List<Customer> executeService(Customer customer) {
		if(customerRepository.countCustomer(customer) < 0) {
			//errorMessage -> データが存在しません
		}
		return customerRepository.selectCustomer(customer);
	}
}
