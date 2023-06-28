package javaPackage;

public class MethodOverload6 {

	
	public static void main(String[] args) {
		System.out.println(MethodOverload5.add(10, 5));
		System.out.println(MethodOverload5.add(10.5, 5.5));
		
		//print A to Z
		
		for(char c = 'A'; c<='Z'; c++) {
			System.out.print(c + " ");
			
		}
	}
}
