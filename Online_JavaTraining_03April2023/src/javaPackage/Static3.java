package javaPackage;

public class Static3 {

	static int z = 5; // static variable
	int y = 1; // global variable

	// static method
	public static void a() {
		z = 10;
		System.out.println(z); // 10
	}

	// non static method
	public void b() {
		z = 15;
		System.out.println(z); // 15
		a();

	}

	public static void main(String[] args) {
		a();

		Static3 s3 = new Static3();
		s3.b();
	}
}
