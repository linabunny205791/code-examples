package edu.csupomona.cs585;

/**
 * A sample calculator that we are going to test.
 *
 */
public class Calculator {

    public double add( double number1, double number2 ) {
    		StringBuffer res = new StringBuffer("test");
    		for(int i = 0; i < 10000; i++) {
    			res.append("a");
    		}

    		if (number1 < 0 || number2 < 0) {
    			throw new IllegalArgumentException(
    					"Only non-negative numbers are allowed!");
    		}
        return number1 + number2;
    }

}
