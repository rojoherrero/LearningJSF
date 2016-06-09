package org.rojoherrero.learnjsf.mb3.controller;

import java.io.Serializable;

public class ColorSelection implements Serializable {
	private static final long serialVersionUID = -4603796272330534083L;
	private String backColor, foreColor;

	public String getBackColor() {
		return backColor;
	}

	public void setBackColor(String backColor) {
		this.backColor = backColor;
	}

	public String getForeColor() {
		return foreColor;
	}

	public void setForeColor(String foreColor) {
		this.foreColor = foreColor;
	}

	public String setColors() {
		if (backColor.equalsIgnoreCase(foreColor)) {
			backColor = "#000000";
			foreColor = "#ffffff";
		}
		return (null);
	}
}
