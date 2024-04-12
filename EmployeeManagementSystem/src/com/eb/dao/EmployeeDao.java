package com.eb.dao;

import java.util.List;
import com.eb.model.Employee;



public interface EmployeeDao {
	public int insert(Employee s);

	public void delete(int id);

	public void update(Employee s);

	public Employee getEmployee(int id);

	public List<Employee> getAllEmployees();
}