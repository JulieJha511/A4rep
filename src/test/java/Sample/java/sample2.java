package Sample.java;

import org.testng.Assert;
import org.testng.annotations.Test;

public class sample2 {
	@Test
	
	public void hardAssertStrictCompaeison() {
		String expectedData = "raja";
	    String actualData = "Raja";
	    Assert.assertEquals(actualData, expectedData);
	    System.out.println("strict comparison passed!!");
	}
	@Test
	public void containsLevelComparison() {
		String expectedData = "raja";
	    String actualData = "maharaja";
	    Assert.assertTrue(actualData.contains(expectedData));
	    System.out.println("strict comparison passed!!");
	}

}
