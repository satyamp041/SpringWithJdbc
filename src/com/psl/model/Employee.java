package com.psl.model;

public class Employee {
	private String employeeId;
	private String employeeName;
	private String email;

	public Employee() {

	}

	public Employee(String employeeId, String employeeName, String email) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.email = email;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
