package org.rojoherrero.learnjsf.mb3.controller;

public class FlipController {

	public String flipCoin() {
		if (Math.random() < 0.5) {
			return ("continue");
		} else {
			return ("stop");
		}
	}
}
