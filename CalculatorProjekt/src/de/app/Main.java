package de.app;

import de.client.CalcClient;
import de.math.Calculator;
import de.math.CalculatorFactory;

public class Main {
	
	public static void main(String[] args) {
		Calculator calculator = CalculatorFactory.create();
		CalcClient client = new CalcClient(calculator);
		client.go();
	}

}
