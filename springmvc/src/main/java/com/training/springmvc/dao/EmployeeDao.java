package com.training.springmvc.dao;

import java.util.List;

import com.training.springmvc.model.Employee;

public interface EmployeeDao {
	public List<Employee> getEmployes();
	public Employee saveEmployee(Employee employee);
	public Employee getEmployeeById(Long id);
	public void deleteEmployeeById(Long id);
}
