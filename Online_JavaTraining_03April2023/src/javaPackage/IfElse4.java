package javaPackage;

public class IfElse4 {

	public static void main(String[] args) {
		int age = 25;
		int weight = 55;
		// Outer if block
		if (age > 18) {

			// inner If block
			if (weight > 50) {
				System.out.println("Eligible");
			} else {
				System.out.println("Not eligible");
			}

		} else {
			System.out.println("Age is not greater than 18");
		}

	}

}
