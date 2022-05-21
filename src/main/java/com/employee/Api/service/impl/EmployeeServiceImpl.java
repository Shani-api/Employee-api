package com.employee.Api.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.Api.Employee;
import com.employee.Api.dao.EmployeeRepository;
import com.employee.Api.service.EmployeeService;

@Service("EmployeeService")
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	
	@Autowired
	EmployeeRepository employeeRepository;
	
	
	/**
	 * Save and update Employee in table
	 */
	@Override
	public void save(Employee employeeDto) {
		try {
			
			employeeRepository.save(employeeDto);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

	/**
	 * Delete Employee Deom Table
	 */
	@Override
	public void delete(int empid) {
		try {
			
			employeeRepository.deleteById(empid);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	

	}

}
