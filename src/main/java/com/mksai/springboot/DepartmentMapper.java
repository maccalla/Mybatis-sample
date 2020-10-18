package com.mksai.springboot;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DepartmentMapper {

	long countDepartment();
	
	List<Department> selectDepartment();
}
