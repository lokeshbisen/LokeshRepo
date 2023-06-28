package javaPackage;

public class RelationalOperator1 {

	public static void main(String[] args) {
		int a = 300;
		int b = 300;
		if (a != b) {
			System.out.println("a is not equal to b");
		} else {
			System.out.println("a is equal to b");
		}

		String p = "HELLO";
		String q = "hello";

		// String comparison 1st way - Case Sensitive

		if (p == q) {
			System.out.println("p and q are equal for 1st way");
		} else {
			System.out.println("p and q are not equal for 1st way");
		}

		// String comparison 2nd way - Case Sensitive
		if (p.equals(q)) {
			System.out.println("p and q are equal for 2nd way");
		} else {
			System.out.println("p and q are not equal for 2nd way");
		}
		// String comparison 3rd way - Not Case Sensitive
		if (p.equalsIgnoreCase(q)) {
			System.out.println("p and q are equal for 3rd way");
		} else {
			System.out.println("p and q are not equal for 3rd way");
		}
	}

}
