package com.mksai.springboot;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CustomerMapper {
	
	long countCustomer();
	
	List<Customer> selectCustomer();
	
	long countCustomerWhereIdName(@Param("cust_id") String cust_id, @Param("cust_name") String cust_name);
	
	Customer selectCustomerWhereIdName(@Param("cust_id") String cust_id, @Param("cust_name") String cust_name);
}
