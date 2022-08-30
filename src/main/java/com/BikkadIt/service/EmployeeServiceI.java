package com.BikkadIt.service;

import com.BikkadIt.model.Employee;

public interface EmployeeServiceI {

	public Employee Saveemployee(Employee employee);
	public Employee getEmployee();
	public Employee getEmployeeById(Integer id);
	public Employee updateemployee(Integer id);
	public void deleteEmployee();
	
	
}
