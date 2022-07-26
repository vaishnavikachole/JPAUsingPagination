package com.jpa.employee.dao;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jpa.employee.entities.Employee;

@Repository
public interface EmployeeDao extends CrudRepository<Employee, Integer>
{
	List<Employee> findByFirstName(String firstName, Pageable pageable);
	
}
