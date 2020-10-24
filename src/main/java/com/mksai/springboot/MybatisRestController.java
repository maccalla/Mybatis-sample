package com.mksai.springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MybatisRestController {
	
	@Autowired
	CustomerSelectCustomerService customerSelectCustomerService;
	
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
	public List<Customer> getJsonCustomer(
			@RequestParam(name = "cust_id", required = false) String cust_id, 
			@RequestParam(name = "cust_name", required = false) String cust_name) {
		Customer customer = new Customer();
		customer.setCust_id(cust_id);
		customer.setCust_name(cust_name);
		List<Customer> result = customerSelectCustomerService.executeService(customer);
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
