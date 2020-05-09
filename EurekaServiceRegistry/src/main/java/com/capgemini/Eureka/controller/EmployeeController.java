package com.capgemini.Eureka.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.Eureka.model.Employee;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class EmployeeController {

	// @SuppressWarnings("unused")
	@GetMapping(value = "/employee")
	@HystrixCommand(fallbackMethod = "getDefauktEmployee")
	public ResponseEntity<Employee> getEmployee() throws Exception {
//		if (true) {
//			throw new Exception();
//		}
		return new ResponseEntity<Employee>(new Employee(12, "Pankaj", "Senior Consultant", 1200000), HttpStatus.OK);
	}

	public ResponseEntity<Employee> getDefauktEmployee() {
		return new ResponseEntity<Employee>(new Employee(15, "Himanshu", "Senior Manager", 1600000), HttpStatus.OK);
	}

}
