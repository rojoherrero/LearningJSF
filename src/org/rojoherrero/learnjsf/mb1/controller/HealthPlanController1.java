package org.rojoherrero.learnjsf.mb1.controller;

public class HealthPlanController1 {

	protected String employeeName, employeeId, healthPlanName;

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getHealthPlanName() {
		return healthPlanName;
	}

	public void setHealthPlanName(String healthPlanName) {
		this.healthPlanName = healthPlanName;
	}

	public String sendYourRequest() {
		if (employeeName.trim().isEmpty() || employeeId.trim().isEmpty() || healthPlanName.trim().isEmpty()) {
			return ("nonValid");
		} else {
			return ("valid");
		}
	}
}
