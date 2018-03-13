package com.training.springmvc.service;

import java.util.List;

import com.training.springmvc.model.Employee;

public interface EmployeeService {
	
	public List<Employee> getEmployes();
	public Employee saveEmployee(Employee employee);
	public Employee getEmployeeById(Long id);
	public void deleteEmployeeById(Long id);
}
