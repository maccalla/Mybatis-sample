package com.mksai.springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SalesRepository {
	
	@Autowired
	SalesMapper salesMapper;
	
	public long countSales() {
		long rtn = salesMapper.countSales();
		return rtn;
	}
	
	public List<Sales> selectSales() {
		List<Sales> rtn = salesMapper.selectSales();
		return rtn;
	}
}
