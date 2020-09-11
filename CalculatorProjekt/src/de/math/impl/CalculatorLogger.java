package de.math.impl;

import de.math.Calculator;
import de.math.CalculatorException;

public class CalculatorLogger implements Calculator {

	private Calculator calculator;
	

	public CalculatorLogger(Calculator calculator) {
		super();
		this.calculator = calculator;
	}

	@Override
	public double add(double a, double b) throws CalculatorException {
		try {
			System.out.println("Add wurde gerufen");
			return calculator.add(a, b);
		} catch (Exception e) {
			throw new CalculatorException(e);
		}
	}

	@Override
	public double sub(double a, double b) throws CalculatorException {
		// TODO Auto-generated method stub
		return 0;
	}

}
