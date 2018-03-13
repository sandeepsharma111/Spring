package com.training.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.training.springmvc.model.Employee;
import com.training.springmvc.service.EmployeeService;

@Controller
public class EmployeeController {

@Autowired	
private EmployeeService employeeService;
   
@RequestMapping("/employee")
	public String  employeeList(ModelMap map,@RequestParam(value="id",required=false)Long id) {
	    map.put("employee", new Employee());
	    if(id!=null&&id.longValue()>0) {
	    	 Employee employee= employeeService.getEmployeeById(id);
	    	 map.put("employee", employee);
	    }
		map.put("empList", employeeService.getEmployes());
		System.out.println("list size:"+employeeService.getEmployes().size());
		return "employee";
	}
@RequestMapping(value="employee",method=RequestMethod.POST)
public String addEmployee(@ModelAttribute("employee") Employee employee,ModelMap map) {
	
	System.out.println("POST");
	
		 employeeService.saveEmployee(employee);
	 map.put("employee", new Employee());
		map.put("empList", employeeService.getEmployes());
	System.out.println("list size:"+employeeService.getEmployes().size());
	return "employee";
}
@RequestMapping("/employee/{id}")
public String  emDelete(ModelMap map,@PathVariable Long id) {
    employeeService.deleteEmployeeById(id);;
   map.put("employee", new Employee());
	map.put("empList", employeeService.getEmployes());
	return "employee";
}
}
