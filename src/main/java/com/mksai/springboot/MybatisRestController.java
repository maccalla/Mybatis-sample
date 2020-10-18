package com.mksai.springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MybatisRestController {
	
	@Autowired
	CustomerRepository customerRepository;
	@Autowired
	EmployeeRepository employeeRepository;
	@Autowired
	DepartmentRepository departmentRepository;
	@Autowired
	PackedsalesRepository packedsalesRepository;
	@Autowired
	ProductRepository productRepository;
	@Autowired
	SalesRepository salesRepository;

	@RequestMapping(value = "/customer", method = RequestMethod.GET)
	public List<Customer> getJsonCustomer() {
		List<Customer> result = customerRepository.selectCustomer();
		return result;
	}
	
	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public List<Employee> getJsonEmployee() {
		List<Employee> result = employeeRepository.selectEmployee();
		return result;
	}
	
	@RequestMapping(value = "/department", method = RequestMethod.GET)
	public List<Department> getJsonDepartment() {
		List<Department> result = departmentRepository.selectDepartment();
		return result;
	}
	
	@RequestMapping(value = "/packedsales", method = RequestMethod.GET)
	public List<Packedsales> getJsonPackedsales() {
		List<Packedsales> result = packedsalesRepository.selectPackedsales();
		return result;
	}
	
	@RequestMapping(value = "/product", method = RequestMethod.GET)
	public List<Product> getJsonProduct() {
		List<Product> result = productRepository.selectProduct();
		return result;
	}
	
	@RequestMapping(value = "/sales", method = RequestMethod.GET)
	public List<Sales> getJsonSales() {
		List<Sales> result = salesRepository.selectSales();
		return result;
	}
}
