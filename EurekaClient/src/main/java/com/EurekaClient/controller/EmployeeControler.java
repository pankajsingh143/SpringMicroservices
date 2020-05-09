package com.EurekaClient.controller;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.capgemini.EurekaClient.model.Employee;

@RestController
public class EmployeeControler {
	@Autowired
	private RestTemplate restTemplate;

	@Bean
	@LoadBalanced
	RestTemplate buildRestTemplate(RestTemplateBuilder builder) {
		return builder.build();

	}

	@GetMapping("/hello")
	public String hello() {
		return "Hello Pankaj";
	}

	@GetMapping("/employeeDetails")
	public ResponseEntity<Employee> getEmployee() {
		try {
			return restTemplate.getForEntity(new URI("http:8761/employee-service/employee"), Employee.class);
		} catch (RestClientException | URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		// return new ResponseEntity<Employee>(new Employee(45, "Pankaj", "Senior
		// Consultant", 56000), HttpStatus.OK);
	}

}
