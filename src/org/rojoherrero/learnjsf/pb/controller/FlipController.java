package org.rojoherrero.learnjsf.pb.controller;

public class FlipController {

	public String flipCoin() {
		if (Math.random() < 0.5) {
			return ("continue");
		} else {
			return ("stop");
		}
	}
}
