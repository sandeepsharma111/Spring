package com.training.springmvc.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.annotations.AttributeAccessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.training.springmvc.dao.EmployeeDao;
import com.training.springmvc.model.Employee;
@Repository
public class EmployeeDaoImpl implements EmployeeDao{
	@Autowired
	SessionFactory factory;
	public List<Employee> getEmployes() {
		return factory.getCurrentSession().createQuery("from Employee ").list();
	}
	public Employee saveEmployee(Employee employee) {
		factory.getCurrentSession().saveOrUpdate(employee);
		return employee;
	}
	@Override
	public Employee getEmployeeById(Long id) {
		// TODO Auto-generated method stub
		return (Employee) factory.getCurrentSession().createQuery("from Employee where id=?").setParameter(0, id).uniqueResult();
	}
	@Override
	public void deleteEmployeeById(Long id) {
		// TODO Auto-generated method stub
		 factory.getCurrentSession().createSQLQuery("delete from employee where id=?").setParameter(0, id).executeUpdate();
	}
}
