package sampleapi.logic;

public class Employee {
	
	private String Name;
	private int EmpId;
	private int Age;
	
	public Employee() {

	}
	
	public Employee(String name, int empId, int age) {
		super();
		Name = name;
		EmpId = empId;
		Age = age;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	
	
}
