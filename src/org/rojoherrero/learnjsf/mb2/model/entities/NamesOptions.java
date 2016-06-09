package org.rojoherrero.learnjsf.mb2.model.entities;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

// I know that this isn't a proper entity

public class NamesOptions {

	// This is for exercise v1
	private List<String> firstNames = new ArrayList<String>() {
		private static final long serialVersionUID = -4098912910505029115L;
		{
			add("Cay");
			add("David");
			add("Marty");
		}
	};

	public List<String> getFirstNames() {
		return (firstNames);
	}

	// This is for the exercise v2
	private Map<String, String> names = new LinkedHashMap<String, String>() {
		private static final long serialVersionUID = -4098912910505029115L;
		{
			put("Cay", "Cay Horstmann");
			put("David", "David Geary");
			put("Marty", "Marty Hall");
		}
	};

	public Map<String, String> getNames() {
		return (names);
	}
}
