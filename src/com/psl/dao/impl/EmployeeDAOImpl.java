package com.psl.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import com.psl.dao.EmployeeDAO;
import com.psl.model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {
	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public void createEmployee(Employee employee) {
		Connection connection = null;
		PreparedStatement ps = null;
		try {
			connection = dataSource.getConnection();
			String SQL = "INSERT INTO employee_table(employee_name,email) VALUES(?,?)";
			ps = connection.prepareStatement(SQL);
			ps.setString(1, employee.getEmployeeName());
			ps.setString(2, employee.getEmail());
			int executeUpdate=ps.executeUpdate();
			if(executeUpdate>0)
				System.out.println("Employee is Created");
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			if(connection!=null)
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}

	}

	@Override
	public List<Employee> getAllEmployee() {

		return null;
	}

}
