package com.employee.Api.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.employee.Api.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer>{

	
	


}
