package javaPackage;

public class Constructor2 {

	int id;
	String name;
	String address;
	
	//default constructor
	Constructor2(){
		System.out.println("hello default construcot");
	}
   // parameterized constructor
	
	Constructor2(int a, String b, String c){
		this.id = a;
		name=b;
		address =c;
		
	}
	
	//non static method
	public void displayInfo() {
		System.out.println(id + " " + name + " "+ address);
	}
	
	public static void main(String[] args) {
		//default constructor
		Constructor2 c2 = new Constructor2();
		
		//Parameterized constructor
		Constructor2 c3 = new Constructor2(1, "John", "London");
		c3.displayInfo();
		Constructor2 c4 = new Constructor2(2, "Peter", "Dubai");
		c4.displayInfo();
	}
}
