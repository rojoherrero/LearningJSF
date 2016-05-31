package org.rojoherrero.learnjsf.controller.pb;

public class FlipController {

	public String flipCoin() {
		if (Math.random() < 0.5) {
			return ("continue");
		} else {
			return ("stop");
		}
	}
}
