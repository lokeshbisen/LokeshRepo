package javaPackage;

public class Array2 {

	public static void main(String[] args) {
		int b[] = {1,2,3,4,5};// defining an int array
        String s[] = {"Hi", "Selenium"}; // defining an string array
        
        Object a[] = {1,2,3,4,5,"Selenium", 6.5}; // defining an object array
        System.out.println(a.length);
        System.out.println(b.length);
        System.out.println(s.length);
        
        System.out.println(a[5]);
        System.out.println(b[4]);
        System.out.println(s[1]);
        
        a[5] = "Automation";// Modifying an array value using index
        System.out.println(a[5]);
		
	}

}
