package org.rojoherrero.learnjsf.pf.controller;

public class Person {
	
	private String firstName, lastName, email;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String doRegistration() {
		if (firstName.trim().isEmpty() || lastName.trim().isEmpty() || email.trim().isEmpty()) {
			return("uncomplete");
		} else {
			return("success");
		}
	}

}
