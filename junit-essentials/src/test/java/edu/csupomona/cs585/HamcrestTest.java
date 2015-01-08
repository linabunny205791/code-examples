package edu.csupomona.cs585;

import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hamcrest.Matchers;
import org.junit.Assume;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

/**
 * A sample hamcrest test.
 *
 * @version $Id: HamcrestTest.java 553 2010-03-06 12:29:58Z paranoid12 $
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class HamcrestTest {

	private List<String> values;

	@Before
	public void setUpList() {
		values = new ArrayList<String>();
		values.add("x");
		values.add("y");
		values.add("z");
		values.add("one");
	}

	@Test
	public void testWithoutHamcrest() {
		boolean isEmpty = !values.isEmpty();
		Assume.assumeTrue(!isEmpty);
		assertTrue(values.contains("one") || values.contains("two")
				|| values.contains("three"));
	}

	@Test
	public void testWithHamcrest() {
		assertThat(values, Matchers.hasItem(anyOf(equalTo("one"), equalTo("two"),
			equalTo("three"))));

		Map<String, String> res = new HashMap<String, String>();
		res.put("yu", "test");
		assertThat(res, Matchers.hasKey("yu"));
	}
}
