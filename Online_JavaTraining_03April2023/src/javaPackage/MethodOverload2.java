package javaPackage;

public class MethodOverload2 extends MethodOverload1 {
	
	public static void main(String[] args) {
		MethodOverload2 mo2 = new MethodOverload2();
		mo2.sum(25, 15); //40
		mo2.sum(10, 5, 20); //35
	}

}
