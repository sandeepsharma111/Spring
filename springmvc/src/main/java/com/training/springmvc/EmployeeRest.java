package com.training.springmvc;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.training.springmvc.model.Employee;
import com.training.springmvc.service.EmployeeService;

@RestController
@RequestMapping("/rs")
public class EmployeeRest {

@Autowired	
private EmployeeService employeeService;
   
@RequestMapping("/employees")
	public List<Employee>  employeeList(@RequestParam(value="id",required=false)String id) {
	   
		return employeeService.getEmployes();
	}
@RequestMapping("/employee/{id}")
public Employee  employeeByid(@PathVariable(value="id")Long id) {
	Employee employee=employeeService.getEmployeeById(id);
	return employee;
}

@RequestMapping(value="/employee",method=RequestMethod.POST)
public List<Employee> addEmployee(@RequestBody Employee employee,ModelMap map) {
		 employeeService.saveEmployee(employee);
	return employeeService.getEmployes();
}
@RequestMapping(value="/employee/{id}",method=RequestMethod.DELETE)
public List<Employee>  emDelete(ModelMap map,@PathVariable Long id) {
   employeeService.deleteEmployeeById(id);
	return employeeService.getEmployes();
}
}
