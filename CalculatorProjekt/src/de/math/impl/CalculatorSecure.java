package de.math.impl;

import de.math.Calculator;
import de.math.CalculatorException;

public class CalculatorSecure implements Calculator{

	private Calculator calculator;

	public CalculatorSecure(Calculator calculator) {
		super();
		this.calculator = calculator;
	}

	public double add(double a, double b) throws CalculatorException {
		System.out.println("Du kommst hier rein");
		return calculator.add(a, b);
	}

	public double sub(double a, double b) throws CalculatorException {
		return calculator.sub(a, b);
	}
	
	public void doSomething() {
		
	}
	

}
