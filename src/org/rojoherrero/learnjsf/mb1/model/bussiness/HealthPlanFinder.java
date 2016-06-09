package org.rojoherrero.learnjsf.mb1.model.bussiness;

import org.rojoherrero.learnjsf.mb1.model.entities.HealthPlan;

public interface HealthPlanFinder {
	
	public HealthPlan findPlan(String planName);
}
