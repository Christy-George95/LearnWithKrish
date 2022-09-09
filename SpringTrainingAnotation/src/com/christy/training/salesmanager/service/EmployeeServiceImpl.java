package com.christy.training.salesmanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.christy.training.salesmanager.model.Employee;
import com.christy.training.salesmanager.repository.EmployeeRepository;
//import com.christy.training.salesmanager.repository.HibernateEmployeeRepositoryImpl;

@Service("employeeService")
public class EmployeeServiceImpl implements  EmployeeService{
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
//	public EmployeeServiceImpl() {
//		System.out.println("Default Constructor Executed");
//	}
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
	
	public EmployeeRepository getEmployeeRepository() {
		return employeeRepository;
	}
	
	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	} 
	
	@Override
	public List<Employee> getAllEmployees(){
		return employeeRepository.getAllEmployees();
	}


	
	

}
