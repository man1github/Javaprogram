package maven.mavenproject;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions {

	String name = "prasath";
	boolean value = true;

	@Test(priority = 1)
	public void checkEquals() {

		Assert.assertEquals(name, "prasath");
		Assert.assertTrue(value, "this is not true");
//	    Assert.assertFalse(value);

	}

	/*
	 * @Test(priority = 1) public void assert1() { // Hard Assertion
	 * System.out.println("before assertion"); Assert.fail();
	 * System.out.println("after assertion");
	 * 
	 * }
	 */

	@Test(priority = 0)
	public void verify() {
		// soft Assertion
		SoftAssert verify1 = new SoftAssert();
		System.out.println("before assertion");
		verify1.fail();
		System.out.println("after assertion");

	}

}
