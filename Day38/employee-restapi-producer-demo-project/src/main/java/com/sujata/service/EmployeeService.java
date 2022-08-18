package com.sujata.service;

import java.util.List;
import java.util.Optional;

import com.sujata.bean.Employee;

public interface EmployeeService {

	List<Employee> getAllEmployees();
	
	Optional<Employee> searchEmployeeByID(int id);
}
