package edu.csupomona.cs585;

public class AutoCalculatorTest {

	public void testAdd() {
		Calculator c = new Calculator();
		double res = c.add(15, 8);
		if (res == 23) {
			System.out.println("Correct!");
		} else {
			throw new IllegalStateException("Wrong result: " + res);
		}
	}

	public void testMinor() {
		Calculator c = new Calculator();
		double res = c.add(15, 8);
		if (res == 23) {
			System.out.println("Correct!");
		} else {
			throw new IllegalStateException("Wrong result: " + res);
		}
	}

	public static void main(String[] args) {
		int errors = 0;
		AutoCalculatorTest cTest = new AutoCalculatorTest();
		try {
			cTest.testAdd();
			cTest.testMinor();
		} catch (IllegalStateException e) {
			errors++;
			e.printStackTrace();
		}

		if (errors > 0) {
			throw new IllegalStateException(errors + " tests failed");
		}
	}

}
