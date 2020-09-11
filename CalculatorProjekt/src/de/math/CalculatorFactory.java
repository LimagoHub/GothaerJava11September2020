package de.math;

import de.math.impl.CalculatorImpl;
import de.math.impl.CalculatorLogger;
import de.math.impl.CalculatorSecure;

public class CalculatorFactory {
	
	public static boolean logger = false;
	public static boolean secure = true ;
	
	public static Calculator create() {
		Calculator calculator = new CalculatorImpl();
		if(logger)
			calculator = new CalculatorLogger(calculator);
		if(secure)
			calculator = new CalculatorSecure(calculator);
		
		return calculator;
	}

}
