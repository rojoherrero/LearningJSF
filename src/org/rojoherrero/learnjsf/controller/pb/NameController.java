package org.rojoherrero.learnjsf.controller.pb;

public class NameController {

	private String firstName;
	private String lastName;

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
	
	public String showName() {
		
		if (firstName.trim().isEmpty() || lastName.trim().isEmpty()) {
			return("badInput");
		} else {
			return("goodInput");
		}
		
	}

}
