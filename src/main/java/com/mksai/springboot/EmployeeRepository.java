package com.mksai.springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository {
	
	@Autowired
	EmployeeMapper employeeMapper;

	public long countEmployee() {
		long rtn = employeeMapper.countEmployee();
		return rtn;
	}
	
	public List<Employee> selectEmployee() {
		List<Employee> rtn = employeeMapper.selectEmployee();
		return rtn;
	}
}
