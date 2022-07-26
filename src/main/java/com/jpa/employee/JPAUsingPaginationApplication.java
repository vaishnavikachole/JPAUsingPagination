package com.jpa.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;

import com.jpa.employee.entities.Employee;
import com.jpa.employee.service.EmployeeService;

@SpringBootApplication
public class JPAUsingPaginationApplication implements CommandLineRunner {

	@Autowired
	private EmployeeService employeeService;
	
	public static void main(String[] args) {
		SpringApplication.run(JPAUsingPaginationApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		List<Employee> employees = employeeService.findByFirstName("shivani",PageRequest.of(0,4,Direction.ASC, "firstName"));
		employees.forEach(System.out::println);
	}
	
	
	

}
