package org.rojoherrero.learnjsf.controller.mb1;

import org.rojoherrero.learnjsf.model.bussiness.mb1.HealthPlanFInderImpl;
import org.rojoherrero.learnjsf.model.bussiness.mb1.HealthPlanFinder;
import org.rojoherrero.learnjsf.model.entities.mb1.HealthPlan;

public class HealthPlanController2 extends HealthPlanController1 {

	private HealthPlan healthPlan;
	private HealthPlanFinder planFinder = new HealthPlanFInderImpl();

	public HealthPlan getHealthPlan() {
		return healthPlan;
	}

	public String sendYourRequest() {
		if (employeeName.trim().isEmpty() || employeeId.trim().isEmpty() || healthPlanName.trim().isEmpty()) {
			return ("uncomplete-info");
		} else {
			healthPlan = planFinder.findPlan(healthPlanName);
			if (healthPlan == null) {
				return ("non-success2");
			} else {
				return ("success2");
			}
		}
	}

}
