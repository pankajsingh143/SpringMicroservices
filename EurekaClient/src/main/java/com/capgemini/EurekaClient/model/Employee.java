package com.capgemini.EurekaClient.model;

public class Employee {
	public Employee(int empId, String empNme, String designation, int salary) {
		super();
		this.empId = empId;
		this.empNme = empNme;
		this.designation = designation;
		this.salary = salary;
	}

	private int empId;
	private String empNme;
	private String designation;
	private int salary;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpNme() {
		return empNme;
	}

	public void setEmpNme(String empNme) {
		this.empNme = empNme;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
