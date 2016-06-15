package org.rojoherrero.learnjsf.el.controller;

import java.util.HashMap;
import java.util.Map;

public class CompanyController {

	private Map<String, String> employees = new HashMap<String, String>() {
		private static final long serialVersionUID = -9016334201342242726L;
		{
			put("a123", "Edgar Allan Poe");
			put("a132", "Mark Twain");
			put("a213", "Jane Austen");
			put("a231", "Immanuel Kant");
			put("a312", "Lev Tolstoi");
			put("a321", "Mary Shelley");
		}
	};

	public Map<String, String> getEmployees() {
		return employees;
	}
}
