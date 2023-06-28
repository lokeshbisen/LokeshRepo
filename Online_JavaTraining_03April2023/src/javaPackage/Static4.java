package javaPackage;

public class Static4 {

	int x = 10; // global variable
	int y = 5; // static variable

	// non static method
	public void a() {
		int z = 10; // local variable
		System.out.println(z); //10

	}

	static int b = 6; // static variable

	// static method
	public static void b() {
		int a = 5; // local variable
		System.out.println(a);//5

	}
	public static void main(String[] args) {
		Static4 s4 = new Static4();
		s4.a();
		System.out.println(s4.b); // Not appropriate way
		System.out.println(Static4.b); // appropriate way
		System.out.println(b);// Correct way
	}

}
