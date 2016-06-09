package org.rojoherrero.learnjsf.mb1.controller;

import org.rojoherrero.learnjsf.mb1.model.bussiness.HealthPlanFinder;
import org.rojoherrero.learnjsf.mb1.model.bussiness.HealthPlanFinderImpl;
import org.rojoherrero.learnjsf.mb1.model.entities.HealthPlan;

public class HealthPlanController2 extends HealthPlanController1 {

	private HealthPlan healthPlan;
	private HealthPlanFinder planFinder = new HealthPlanFinderImpl();

	public HealthPlan getHealthPlan() {
		return healthPlan;
	}
	
	@Override
	public String sendYourRequest() {
		if (employeeName.trim().isEmpty() || employeeId.trim().isEmpty() || healthPlanName.trim().isEmpty()) {
			return ("uncomplete-info");
		} else {
			healthPlan = planFinder.findPlan(healthPlanName);
			if (healthPlan == null) {
				return ("unknowPlan");
			} else {
				return ("success");
			}
		}
	}

}
