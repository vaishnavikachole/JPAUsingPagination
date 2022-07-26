package com.jpa.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.jpa.employee.dao.EmployeeDao;
import com.jpa.employee.entities.Employee;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDao employeeDao;

	public List<Employee> findByFirstName(String firstName, PageRequest pageRequest) {
		
		return employeeDao.findByFirstName(firstName,pageRequest);
	}
	
	
	
}
