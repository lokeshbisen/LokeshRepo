package javaPackage;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {
		//creating Arraylist
		
		ArrayList<Object> obj = new ArrayList<Object>();
		
		//Adding object in ArrayList
		
		obj.add(1);
		obj.add("Selenium");
		obj.add(7.0);
		obj.add('a');
		obj.add(3>12);
		
		//printing ArrayList Element - 1st way
		System.out.println(obj);
		
		//printing ArrayList Element - 2nd way
		
		Iterator abc = obj.iterator();
		while(abc.hasNext()) {
			System.out.println("Using iterator and while loop;" + abc.next());

		}
		
		//printing ArrayList Element - 3rd way

		for(Object bcd : obj) {
			System.out.println("Using for each loop : "  + bcd);
			
		}
	}

}
