package org.rojoherrero.learnjsf.mb2.controller;

import org.rojoherrero.learnjsf.mb1.model.bussiness.HealthPlanFinder;
import org.rojoherrero.learnjsf.mb1.model.bussiness.HealthPlanFinderImpl;
import org.rojoherrero.learnjsf.mb1.model.entities.HealthPlan;

public class HealthPlanController {

	private String employeeName, employeeId, healthPlanName;
	private HealthPlan healthPlan;
	private HealthPlanFinder planFinder = new HealthPlanFinderImpl();

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

	public HealthPlan getHealthPlan() {
		return healthPlan;
	}

	public String sendYourRequest() {
		if (employeeName.trim().isEmpty() || employeeId.trim().isEmpty()) {
			return("uncomplete");
		} else {
			healthPlan = planFinder.findPlan(healthPlanName);
			return ("success");
		}
		
	}
}
