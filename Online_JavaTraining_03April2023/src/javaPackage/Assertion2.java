package javaPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion2 {
	
	@Test
	public void testCase2() {
		
		String actualText ="ab";
		String expText ="ab";
		
		int a=10;
		int b=20;
		
		
		//Equal Assertion
		Assert.assertEquals(actualText, expText, "Actual and expected are not matching");
		System.out.println("Equal Assertion pass");
		
		//False Assertion
		Assert.assertFalse(a>b,"a is greater than b");
		System.out.println("False Assertion verified");
		
		//True Assertion
		Assert.assertTrue(a>b,"a is lesser than b");
		
		//Assertion Failed, Execution will stop here
		//Further line of code will not execute
		System.out.println("False Assertion verified");
		
		
	}
	
	@Test
	public void testCase3() {
		//Assertion is written in testCase2() method
		//Hence the scope of assertion is limited to testCase2() method only.
		System.out.println("Hello tesCase3() method");
	}

}
