package javaPackage;

public class Static5 {

	String a; // global variable
	int b ; // global variable
	static int c = 4; // static variable
	//static method
	public static void a() {
		System.out.println("hello static");
	}
	
	public static void main(String[] args) {
		Static5 s5 = new Static5();
		s5.a = "Selenium";
		s5.b = 1;
		c=2;
		a();
		
		System.out.println(s5.a + " " + s5.b + " " + c);
		
		int j=5;
		j=j; //variable initialization with same variable
		System.out.println(j);
		
				

	}

}
