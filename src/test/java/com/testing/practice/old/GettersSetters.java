package com.testing.practice.old;

public class GettersSetters {

	public String lastName;
	public String firstName;
	public String age;

	public GettersSetters(String lastName, String firstName, String age) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.age = age;
	}

	// Getters & Setters for fields
	public String getLastName() {
		return lastName;
	}

	public void setLaetName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

}
