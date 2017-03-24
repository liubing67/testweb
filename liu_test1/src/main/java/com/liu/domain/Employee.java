package com.liu.domain;

import java.util.Date;



public class Employee {

	private Integer id;
	private String name;
	private String email;
	private Date hiredate;
	private Float salary;
	private String pwd;
	private Integer grade;
	
	private Department department;
	
	

	public Employee() {
		
	}
	
	public Employee(String name, String email, Date hiredate, Float salary,
			String pwd, Integer grade) {
		super();
		
		this.name = name;
		this.email = email;
		this.hiredate = hiredate;
		this.salary = salary;
		this.pwd = pwd;
		this.grade = grade;
//		this.department=department;
	}

	public Employee( String name, String email, Date hiredate,
			Float salary) {
		this.name = name;
		this.email = email;
		this.hiredate = hiredate;
		this.salary = salary;
	}
	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public Integer getGrade() {
		return grade;
	}

	public void setGrade(Integer grade) {
		this.grade = grade;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	public Float getSalary() {
		return salary;
	}
	public void setSalary(Float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email
				+ ", hiredate=" + hiredate + ", salary=" + salary + ", pwd="
				+ pwd + ", grade=" + grade  + "]";
	}
	
	
	
}
