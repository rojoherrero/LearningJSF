package org.rojoherrero.learnjsf.el.controller;

import java.util.ArrayList;
import java.util.List;

public class ColorController {

	private List<String> colors = new ArrayList<String>() {
		private static final long serialVersionUID = 2103710482367318844L;
		{
			add("red");
			add("green");
			add("blue");
			add("purple");
		}
	};

	public List<String> getColors() {
		return colors;
	}
}
