package com.brillio.org;

public class Employee {
	int empId;
	String empName;
	double empSalary;
	String empCompany;

	public static void main(String[] args) {
		Employee ref = new Employee();
		ref.empId = 101;
		ref.empCompany = "Brillio";
		ref.empName = "Sarika";
		ref.empSalary = 5000;
		System.out.println(ref.empId);
		System.out.println(ref.empName);
		System.out.println(ref.empCompany);
		System.out.println(ref.empSalary);
		 

	}
}
