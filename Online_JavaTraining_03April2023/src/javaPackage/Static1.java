package javaPackage;

public class Static1 {

	
	int roll; // declaring global variable
	String name; // declaring global variable
	static String college = "IIT Bombay"; // static variable
	
	//Constructor
	Static1(int r, String n){
		r = roll;
		n = name;
		
	}
	
	public void getResult() {
		System.out.println(roll + "  " + name + "  " + college);
	}


}
