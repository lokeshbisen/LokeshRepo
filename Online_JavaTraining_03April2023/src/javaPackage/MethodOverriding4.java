package javaPackage;

public class MethodOverriding4 extends MethodOverriding3{

	public void run() {
		System.out.println("You are running");
	}
	public static void main(String[] args) {
		MethodOverriding4 mo4 = new MethodOverriding4();
		mo4.run();
		MethodOverriding3 mo3 = new MethodOverriding3();
				mo3.run();
	}
}
