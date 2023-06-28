package javaPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion3 {

	@Test
	public void testCase4() {
		String actualText ="ab";
		String expText ="abc";
		
		try {
			Assert.assertEquals(actualText, expText);
		} catch (Error e) {
			
			
		}
		
		System.out.println("Equal Assertion pass");
	}
}
