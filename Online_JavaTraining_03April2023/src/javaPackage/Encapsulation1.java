package javaPackage;

public class Encapsulation1 {

	String name; //Global variable
	int b; //Global variable
	final int c=2;//final variable
	
	//final variable
	public void a() {
		//c=5; // final variable can not change the value.
	}
	
	//final method
	final void d() {
		System.out.println("final method");
	}
	
	public void setname(String s) {
		this.name =s;
		this.b=5;
		System.out.println(b);
		System.out.println(c);
	}

	public Object getName() {
		return name;
	}
		
	}

