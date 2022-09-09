package com.christy.training.salesmanager.repository;

import java.util.List;

import com.christy.training.salesmanager.model.Employee;

public interface EmployeeRepository {

	List<Employee> getAllEmployees();

}