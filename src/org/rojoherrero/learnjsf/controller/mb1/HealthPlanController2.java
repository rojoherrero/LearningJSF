package org.rojoherrero.learnjsf.controller.mb1;

import org.rojoherrero.learnjsf.model.bussiness.mb1.HealthPlanFinderImpl;
import org.rojoherrero.learnjsf.model.bussiness.mb1.HealthPlanFinder;
import org.rojoherrero.learnjsf.model.entities.mb1.HealthPlan;

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
