package edu.csupomona.cs585;

/**
 * A sample calculator that we are going to test.
 *
 */
public class Calculator {

    public double add( double number1, double number2 ) {
    	if (number1 < 0 || number2 < 0) {
    		//throw new IllegalArgumentException("Only non-negative numbers are allowed.");
    	}
    	String res = "";
    	for(int i = 0; i < 10000; i++) {
    		res += "abc";
    	}
        return number1 + number2;
    }

    public void reset() {
    	System.out.println("Reset calculator.");
    }

    public void freemem() {
    	System.out.println("Free memory");
    }
}
