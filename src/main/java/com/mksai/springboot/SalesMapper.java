package com.mksai.springboot;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SalesMapper {

	long countSales();
	
	List<Sales> selectSales();
}
