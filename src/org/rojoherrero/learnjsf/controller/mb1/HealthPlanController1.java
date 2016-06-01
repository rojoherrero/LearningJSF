package org.rojoherrero.learnjsf.controller.mb1;

public class HealthPlanController1 {

	protected String employeeName;
	protected String employeeId;
	protected String healthPlanName;

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
