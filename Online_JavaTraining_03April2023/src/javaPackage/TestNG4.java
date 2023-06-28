package javaPackage;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNG4 {

	// @Test - 1st way
	public void a() {
		System.out.println("a test method");
	}

	// 2nd Way-Widely used in market
	@Test(enabled=false)
	public void b() {
		System.out.println("b test method");
	}
	@Test(enabled=true)
	public void c() {
		System.out.println("c test method");
	}
	
	//Invocation - 2 times
	@Test(invocationCount=2)
	public void d() {
		System.out.println("d test method");
	}

	//Invocation - 0 times - 3rd way
		@Test(invocationCount=0)
		public void e() {
			System.out.println("e test method");
		}
		
		
		//Correct way - Not Recommended
		@Test
		public void f() {
			System.out.println("f test method");
			throw new SkipException("Skipping f test method");
		}
}
