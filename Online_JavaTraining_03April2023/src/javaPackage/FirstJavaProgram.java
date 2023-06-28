package javaPackage;



public class FirstJavaProgram {

	int a = 5; //global variable or class variable
	static int c= 15;//static variable
	
	// predefined method
	public static void main(String[] args) {
		
		System.out.println("Lokesh");
		System.out.println("12345");
		System.out.println("kumar");
		int b = 10; // local variable
		aMethod();
	

	}
	//user defined static method
	public static void aMethod() {
		System.out.println("Hello a method");
	}
	//user defined method
		public void bMethod() {
			System.out.println("Hello b method");
		}

}
