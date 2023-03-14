package com.emp;



public class EmployeeDetail {
	/*
	 * int id; String name; String salary; Employee employee;
	 * 
	 * 
	 * public EmployeeDetail(int id, String name, String salary, Employee employee)
	 * { super(); this.id = id; this.name = name; this.salary = salary;
	 * this.employee = employee; } void show() {
	 * System.out.println(id+" "+name+" "+salary);
	 * System.out.println(employee.id+" "+employee.city+" "+employee.cmpname); 
	 * }
	 * 
	 * public static void main(String[] args) { Employee employee2 = new
	 * Employee(1,"baghnagar","sakesoft"); EmployeeDetail Detail = new
	 * EmployeeDetail(1,"asad","95000",employee2); Detail.show(); }
	 */

	public static void main(String[] args) {
		Employee e = new  Employee(); 
		e.setId(1);
		e.setName("Abrr");
		e.setSalary(600000);
		e.setCmpname("tcs");
		System.out.println(e);
	}
	
	
}
