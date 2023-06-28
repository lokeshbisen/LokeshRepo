package javaPackage;

public class Encapsulation2 extends Encapsulation1 {
	//final method cannot override
		/*final void d() {
			System.out.println("final method");
		}
*/
	
	public static void main(String[] args) {
		Encapsulation2 e2 = new Encapsulation2();
		
		e2.setname("Selenium");
		System.out.println(e2.getName());
	}
}
