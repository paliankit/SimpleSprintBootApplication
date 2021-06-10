package sampleapi.logic;


import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class NewController {
	@Autowired
	private EmployeeService employeeservice;

	@GetMapping("/employees")
	public List<Employee> getAllEmployees() {
		
		return employeeservice.getAllEmployees();
	}
	
	@GetMapping("/employee/{name}")
	public Employee getEmployee(@PathVariable String name) {
		
		return employeeservice.getEmployee(name);
	}
	
	
}
