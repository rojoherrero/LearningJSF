package org.rojoherrero.learnjsf.el.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumbersController {

	private List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(-3, -2, -1, 0, 1, 2, 3));

	public List<Integer> getNumbers() {
		return numbers;
	}
}
