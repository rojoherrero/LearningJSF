package org.rojoherrero.learnjsf.mb2.model.entities;

import java.util.ArrayList;
import java.util.List;

public class PlansOptions {
	private List<String> allPlans = new ArrayList<String>(){
		private static final long serialVersionUID = 6942820556833930603L;
		{
			add("Full Care");
			add("Deluxe Care");
			add("Best Care");
			add("Medium Care");
		}
	};

	public List<String> getAllPlans() {
		return allPlans;
	}
	
	
	
}
