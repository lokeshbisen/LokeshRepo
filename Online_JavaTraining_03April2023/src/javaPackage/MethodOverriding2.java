package javaPackage;

public class MethodOverriding2 extends MethodOverriding1 {
	
	public void eat() {
		System.out.println("you are eating");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		MethodOverriding2 mo2 = new MethodOverriding2();
		mo2.eat();
	}

}
