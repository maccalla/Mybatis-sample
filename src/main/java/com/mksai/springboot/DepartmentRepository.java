package com.mksai.springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DepartmentRepository {
	
	@Autowired
	DepartmentMapper departmentMapper;
	
	public long countDepartment() {
		long rtn = departmentMapper.countDepartment();
		return rtn;
	}
	
	public List<Department> selectDepartment() {
		List<Department> rtn = departmentMapper.selectDepartment();
		return rtn;
	}
}
