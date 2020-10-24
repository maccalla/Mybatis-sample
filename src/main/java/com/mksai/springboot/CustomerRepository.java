package com.mksai.springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerRepository {
	
	@Autowired
	CustomerMapper customerMapper;
	
	public long countCustomer(Customer customer) {
		long rtn = customerMapper.countCustomer(customer);
		return rtn;
	}
	
	public List<Customer> selectCustomer(Customer customer) {
		List<Customer> rtn = customerMapper.selectCustomer(customer);
		return rtn;
	}
	
	public long countCustomerWhereIdName(String cust_id, String cust_name) {
		long rtn = customerMapper.countCustomerWhereIdName(cust_id, cust_name);
		return rtn;
	}
	
	public Customer selectCustomerWhereIdName(String cust_id, String cust_name) {
		Customer rtn = customerMapper.selectCustomerWhereIdName(cust_id, cust_name);
		return rtn;
	}
}
