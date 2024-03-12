package com.pj;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	
	
    public Employee saveEmployee(Employee employee)
    {return service.saveEmployee(employee);}
	
	public List<Employee> getAllEmployee()
	{return service.getAllEmployee();}
	
	public void deleteEmployee(Integer id)
	{service.deleteEmployeeById(id);}
	
	
}
