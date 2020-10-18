package com.mksai.springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {
	
	@Autowired
	ProductMapper productMapper;

	public long countProduct() {
		long rtn = productMapper.countProduct();
		return rtn;
	}
	
	public List<Product> selectProduct() {
		List<Product> rtn = productMapper.selectProduct();
		return rtn;
	}
}
