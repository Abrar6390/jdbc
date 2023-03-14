package com.emp;

public class Employee {
	
	private int id;
	private String name;
	private int salary;
	private String cmpname;
	
	public Employee() {
		super();
	}

	public Employee(int id, String name, int salary, String cmpname) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.cmpname = cmpname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getCmpname() {
		return cmpname;
	}

	public void setCmpname(String cmpname) {
		this.cmpname = cmpname;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", cmpname=" + cmpname + "]";
	}	
	
	
	
	
	
	/*
	 * int id; String city; String cmpname; Employee(int id,String city,String
	 * cmpname) { this.id=id; this.city=city; this.cmpname=cmpname; }
	 */
}
