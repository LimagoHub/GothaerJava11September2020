package de.math.impl;

import de.math.Calculator;
import de.math.CalculatorException;

public class CalculatorImpl implements Calculator {

	@Override
	public double add(double a, double b) throws CalculatorException {
		return a + b;
	}

	@Override
	public double sub(double a, double b) throws CalculatorException {
		return a - b;
	}

}
