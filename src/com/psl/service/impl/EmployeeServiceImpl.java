package com.psl.service.impl;

import java.util.List;

import com.psl.dao.EmployeeDAO;
import com.psl.model.Employee;
import com.psl.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDAO employeeDAO;

	public void setEmployeeDAO(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}

	@Override
	public void addEmployee(Employee employee) {
		employeeDAO.createEmployee(employee);

	}

	@Override
	public List<Employee> fetchAllEmployee() {
		return employeeDAO.getAllEmployee();
	}

}
