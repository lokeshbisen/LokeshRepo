package javaPackage;

public class LogicalOperator2 {

	public static void main(String[] args) {
		int a= 10;
		int b = 5;
		int c = 20;
		
	// Logical Operator
	System.out.println(a < b && a++ < c);// false
	System.out.println(a); // 10
	
	// Bitwise Operator
	System.out.println(a < b & a++ < c); // false
	System.out.println(a);

	}

}
