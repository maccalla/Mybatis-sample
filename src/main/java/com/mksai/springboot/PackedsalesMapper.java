package com.mksai.springboot;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PackedsalesMapper {

	long countPackedsales();
	
	List<Packedsales> selectPackedsales();
}
