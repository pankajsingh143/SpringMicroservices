package com.capgemini.AuthorizationResource;

import java.util.LinkedList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
	@GetMapping("/person")
	public List<Person> getPerson() {
		List<Person> personList = new LinkedList<>();
		personList.add(new Person("Pankaj", "Singh"));
		personList.add(new Person("Rajesh", "Yadav"));
		personList.add(new Person("Pankaj", "Singh"));
		return personList;
	}
}
