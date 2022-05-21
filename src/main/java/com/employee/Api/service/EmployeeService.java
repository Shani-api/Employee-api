package com.employee.Api.service;

import com.employee.Api.Employee;

public interface EmployeeService {

	void save(Employee employeeDto);

	void delete(int empid);



}
