package com.employee.Api.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.Api.Employee;
import com.employee.Api.service.EmployeeService;

@RestController
public class EmployeeController {

	
	@Autowired
	EmployeeService employeeService;
	
	/**
	 * Create Service
	 * @param employeeDto
	 * @return
	 */
	
	
	@PostMapping("/save-employee")  
	private int saveEmployee(@RequestBody Employee employeeDto)   
	{  
		employeeService.save(employeeDto);  
	return employeeDto.getEmpId();  
	}  
	
	/**
	 * Update Service
	 * @param employeeDto
	 * @return
	 */
	
	
	@PutMapping("/update-employee")  
	private int update(@RequestBody Employee employeeDto)   
	{  
		employeeService.save(employeeDto);  
	return employeeDto.getEmpId();  
	}  
	
	/**
	 * Delete Service
	 * @param empid
	 */
	
	@DeleteMapping("/employee/{empid}")  
	private void deleteBook(@PathVariable("empid") int empid)   
	{  
		employeeService.delete(empid);  
	}  
	
}
