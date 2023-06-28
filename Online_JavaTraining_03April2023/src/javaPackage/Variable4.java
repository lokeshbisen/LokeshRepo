package javaPackage;

public class Variable4 {

	
	int b = 10; // global variable
	static int c = 5; // static variable
	public static void main(String[] args) {
	int a = 6; // local variable
	System.out.println(a);	//6
	
	//static member calling = directly we can call
	System.out.println(c); //5
	d();//15
	
	//Non static member calling = we call with the help of object.
	Variable4 v4 = new Variable4();
	System.out.println(v4.b); //10
	v4.f();//5
	
		
	}

	public static void d(){
		int e = 15;
	  System.out.println(e);
	}
	
	public void f(){
		int g = 5;
	  System.out.println(g);
	}
}
