package org.rojoherrero.learnjsf.model.bussiness.mb1;

import java.util.ArrayList;

import org.rojoherrero.learnjsf.model.entities.mb1.HealthPlan;

public class HealthPlanFInderImpl implements HealthPlanFinder {

	ArrayList<HealthPlan> availablePlans = new ArrayList<HealthPlan>() {
		private static final long serialVersionUID = 2950652453024414171L;
		{
			add(new HealthPlan("Full Care", "794 761 487", 1054));
			add(new HealthPlan("Deluxe Care", "436 840 094", 1456));
			add(new HealthPlan("Best Care", "469 234 567", 1856));
			add(new HealthPlan("Medium Care", "987 258 357", 400));
		}
	};

	@Override
	public HealthPlan findPlan(String planName) {
		for (HealthPlan plan : availablePlans) {
			if(plan.getName().equalsIgnoreCase(planName)){
				return(plan);
			}
		}
		return null;
	}

}
