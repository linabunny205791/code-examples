package edu.csupomona.cs585;

import java.io.File;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CalculatorTest {

	private static boolean isConnected = false;

	@Rule
	public TemporaryFolder folder = new TemporaryFolder();



	private static Calculator c;

	@BeforeClass
	public static void setup() {
		//Assume.assumeTrue(isConnected);
		System.out.println("Setup");
		c = new Calculator();
	}

	@AfterClass
	public static void cleanup() {
		System.out.println("cleanup");
	}

	@Test(timeout = 1000)
	public void testAdd() {
		System.out.println("testadd");
		double res = c.add(41, 4);
		Assert.assertEquals(45, res, 0);
	}

	@Test
	public void testAdd2() throws IOException {
		System.out.println("testadd2");
		double res = c.add(41, 0);
		Assert.assertEquals(41, res, 0);

		//
	    File createdFile = folder.newFile("myfile.txt");
	    File createdFolder = folder.newFolder("mysubfolder");
	    System.out.println(createdFile.getAbsolutePath());
	    System.out.println(createdFolder.getAbsolutePath());
	}

	@Test(expected = IllegalArgumentException.class)
	public void testAddThrowException() {
		System.out.println("testaddexception");
		double res = c.add(-41, 0);
	}
}
