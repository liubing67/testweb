package com.liu.domain;

import java.util.Set;

public class Department {

	private Integer id;
	private String name;
	private Set<Employee> employee;
	
	
	
	
	public Department() {
		super();
	}
	public Department(String name, Set<Employee> employee) {
		super();
		this.name = name;
		this.employee = employee;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Employee> getEmployee() {
		return employee;
	}
	public void setEmployee(Set<Employee> employee) {
		this.employee = employee;
	}
	
	
	
}
