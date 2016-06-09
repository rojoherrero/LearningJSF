package org.rojoherrero.learnjsf.mb3.model.entities;

import java.util.HashMap;
import java.util.Map;

public class ColorOptions {

	private Map<String, String> colors = new HashMap<String, String>() {
		private static final long serialVersionUID = 350733999238570137L;
		{
			put("red", "#ff0000");
			put("blue", "#0000ff");
			put("yellow", "#ffff00");
			put("green", "#008000");
			put("brown", "#a52a2a");
			put("orange", "#ffa500");
			put("purple", "#800080");
		}
	};

	public Map<String, String> getColors() {
		return colors;
	}
}
