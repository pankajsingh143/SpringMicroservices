package com.capgemini.AuthorizationResource;

public class Person {
	private String firstName;
	private String lastName;

	public Person(String lastName) {
		super();
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + "]";
	}

	public Person(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
