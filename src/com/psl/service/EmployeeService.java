package com.psl.service;

import java.util.List;

import com.psl.model.Employee;

public interface EmployeeService {
	public abstract void addEmployee(Employee employee);

	public List<Employee> fetchAllEmployee();
}
