package org.rojoherrero.learnjsf.el.controller;

import java.util.ArrayList;
import java.util.List;

public class NumbersController {

	private List<Integer> numbers = new ArrayList<Integer>() {
		private static final long serialVersionUID = -438499201599616197L;
		{
			add(-3);
			add(-2);
			add(-1);
			add(0);
			add(1);
			add(2);
		}
	};

	public List<Integer> getNumbers() {
		return numbers;
	}
}
