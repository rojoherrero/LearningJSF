package org.rojoherrero.learnjsf.model.bussiness.mb1;

import org.rojoherrero.learnjsf.model.entities.mb1.HealthPlan;

public interface HealthPlanFinder {
	
	public HealthPlan findPlan(String planName);
}
