package edu.csupomona.cs585;

public class AutoCalculatorTest {

	public void testAdd() {
		Calculator c = new Calculator();
		double res = c.add(51, 8);
		if (res == 59) {
			System.out.println("Correct");
		} else {
			throw new IllegalStateException("The sum is incorrect.");
		}
	}

	public void testAdd2() {
		Calculator c = new Calculator();
		double res = c.add(30, 8);
		if (res == 38) {
			System.out.println("Correct");
		} else {
			throw new IllegalStateException("The sum is incorrect.");
		}
	}

	public static void main(String[] args) {
		int errors = 0;
		AutoCalculatorTest act = new AutoCalculatorTest();
		try {
			act.testAdd();
			act.testAdd2();
		} catch (IllegalStateException e) {
			errors ++;
			e.printStackTrace();
		}

		if (errors > 0) {
			throw new IllegalStateException("You have " + errors + " errors.");
		}
	}
}
