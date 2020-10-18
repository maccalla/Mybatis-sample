package com.mksai.springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerRepository {
	
	@Autowired
	CustomerMapper customerMapper;
	
	public long countCustomer() {
		long rtn = customerMapper.countCustomer();
		return rtn;
	}
	
	public List<Customer> selectCustomer() {
		List<Customer> rtn = customerMapper.selectCustomer();
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
