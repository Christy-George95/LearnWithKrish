package com.christy.training.salesmanager.repository;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.christy.training.salesmanager.model.Employee;


@Repository("emloyeeRepository")
public class HibernateEmployeeRepositoryImpl implements EmployeeRepository {
	
	@Override
	public List<Employee> getAllEmployees(){
		List<Employee> employees = new ArrayList<>();
		
		Employee employee = new Employee();
		employee.setEmployeeName("Christy");
		employee.setEmployeeLocation("Jaffna");
		employees.add(employee);
		return employees;
	}

}
