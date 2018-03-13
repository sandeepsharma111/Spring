package com.training.springmvc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.training.springmvc.dao.EmployeeDao;
import com.training.springmvc.model.Employee;
import com.training.springmvc.service.EmployeeService;
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private EmployeeDao dao ;
	public List<Employee> getEmployes() {
		return dao.getEmployes();
	}
	public Employee saveEmployee(Employee employee) {
		return dao.saveEmployee(employee);
	}
	@Override
	public Employee getEmployeeById(Long id) {
		// TODO Auto-generated method stub
		return dao.getEmployeeById(id);
	}
	@Override
	public void deleteEmployeeById(Long id) {
		// TODO Auto-generated method stub
		dao.deleteEmployeeById(id);
	}

}
