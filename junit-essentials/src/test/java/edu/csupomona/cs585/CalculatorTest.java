package edu.csupomona.cs585;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.hamcrest.Matchers;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.junit.rules.ExpectedException;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CalculatorTest {

	@Rule
    public ExpectedException thrown = ExpectedException.none();


	private static Calculator c;

	@BeforeClass
	public static void setup() {
		c = new Calculator();
		c.reset();
	}

	@AfterClass
	public static void cleanup() {
		c.freemem();
	}

	@Test
	public void testAdd() {
		System.out.println("1");
		double res = c.add(5, 1);
		assertEquals(6, res, 0);


		res = c.add(5, 10);
		assertEquals(15, res, 0);

		res = c.add(15, 10);
		assertEquals("Incorrect add operation. Wrong sum value.", 25, res, 0);

		assertTrue(res > 0);

		assertNotNull(c);
	}

	@Test
	public void testAdd2() {
		System.out.println("2");
		double res = c.add(7, 1);
		assertEquals(8, res, 0);
	}

	@Test()
	public void atestAdd3() {
		System.out.println("3");
		double res = c.add(7, 1);
		assertEquals(8, res, 0);

		thrown.expect(NullPointerException.class);
	    throw new NullPointerException();

	}

	@Rule
	   public ErrorCollector collector = new ErrorCollector();

	   @Test
	   public void fails_after_execution() {
		   collector.checkThat("a", Matchers.equalTo("b"));
		   collector.checkThat(1, Matchers.equalTo(2));
		   collector.checkThat("ae", Matchers.equalTo("g"));
	   }


}
