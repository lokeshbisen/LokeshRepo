package javaPackage;



public class Variable1 {
	
	int d= 100; // Global variable
	static int g= 200; // static variable
	

	public static void main(String[] args) {
		
		int a = 5;// int type local variable
		System.out.println(a);

		a = 10;
		System.out.println(a);

		char c = 'a'; // char type local variable
		System.out.println(c);

		boolean b = false;
		b = true;
		System.out.println(b);

		System.out.println(3 > 12);

		int e = 2;
		int f = 3;
		boolean z = e > f;
		
		System.out.println(z);
		// Calculate the length of string
		String s = "Hello Java";
		int sLength = s.length();
		System.out.println(sLength);
		
	

	}

}
