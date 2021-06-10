package sampleapi.logic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	private List<Employee> topics= Arrays.asList(
			new Employee("Abcd",123,21),
			new Employee("Efgh",789,25),
			new Employee("Xyz",741,30));
	
	public List<Employee> getAllEmployees(){
		return topics;
	}

	public Employee getEmployee(String name) {
		return topics.stream().filter(t -> t.getName().equals(name)).findFirst().get();
	}
}
