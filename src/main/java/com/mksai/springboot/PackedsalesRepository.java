package com.mksai.springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PackedsalesRepository {

	@Autowired
	PackedsalesMapper packedsalesMapper;
	
	public long countPackedsales() {
		long rtn = packedsalesMapper.countPackedsales();
		return rtn;
	}
	
	public List<Packedsales> selectPackedsales() {
		List<Packedsales> rtn = packedsalesMapper.selectPackedsales();
		return rtn;
	}
}
