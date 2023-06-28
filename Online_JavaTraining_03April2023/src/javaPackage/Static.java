package javaPackage;

public class Static {

	
	int roll; // declaring global variable
	String name; // declaring global variable
	String college; // declaring global variable
	
	public static void main(String[] args) {
		
		Static s1 = new Static();
		System.out.println(s1.roll); // 0
		System.out.println(s1.name); // null
		System.out.println(s1.college);// null

	}

}
