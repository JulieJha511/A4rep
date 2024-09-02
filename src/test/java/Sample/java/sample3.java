package Sample.java;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class sample3 {
@Test
	
	public void softAssertStrictCompaeison() {
		String expectedData = "raja";
	    String actualData = "Raja";
	    SoftAssert as = new SoftAssert();
	   as.assertEquals(actualData, expectedData);
	    System.out.println("strict comparison passed!!");
	    as.assertAll();
	}
	@Test
	public void containsLevelComparison() {
		String expectedData = "raja";
	    String actualData = "maharaja";
	    SoftAssert as = new SoftAssert();
	    as.assertTrue(actualData.contains(expectedData));
	    System.out.println("strict comparison passed!!");
	    as.assertAll();
	    
	}


}
