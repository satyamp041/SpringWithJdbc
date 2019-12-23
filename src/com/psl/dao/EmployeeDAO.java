package com.psl.dao;

import java.util.List;

import com.psl.model.Employee;

public interface EmployeeDAO {
	public abstract void createEmployee(Employee employee);

	public abstract List<Employee> getAllEmployee();
}
