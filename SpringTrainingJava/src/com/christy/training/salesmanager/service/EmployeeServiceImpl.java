package com.christy.training.salesmanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.christy.training.salesmanager.model.Employee;
import com.christy.training.salesmanager.repository.EmployeeRepository;
//import com.christy.training.salesmanager.repository.HibernateEmployeeRepositoryImpl;

public class EmployeeServiceImpl implements  EmployeeService{
	
	
	EmployeeRepository employeeRepository;
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		System.out.println("Overload Constructor executed");
		this.employeeRepository = employeeRepository;
	}
	
	
	
	public EmployeeServiceImpl() {
		System.out.println("Default constructor executed");
	}



	public EmployeeRepository getEmployeeRepository() {
		return employeeRepository;
	}
	@Autowired
	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		System.out.println("Setter executed");
		this.employeeRepository = employeeRepository;
	} 
	
	@Override
	public List<Employee> getAllEmployees(){
		return employeeRepository.getAllEmployees();
	}


	
	

}
