package com.psl.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psl.model.Employee;
import com.psl.service.EmployeeService;
import com.psl.service.impl.EmployeeServiceImpl;

public class EmployeeJDBCTest {

	public static void main(String[] args) {
		AbstractApplicationContext abstractApplicationContext = new ClassPathXmlApplicationContext(
				"beans.xml");
		EmployeeService employeeService = abstractApplicationContext.getBean(
				"employeeService", EmployeeServiceImpl.class);
		createEmployee(employeeService);
		abstractApplicationContext.close();

	}

	private static void createEmployee(EmployeeService employeeService) {
		Employee employee = new Employee();
		employee.setEmployeeName("Satyam Patil");
		employee.setEmail("satyampatil@gmail.com");
		employeeService.addEmployee(employee);
	}

}
