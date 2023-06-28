package javaPackage;

public class Variable2_Array {

	//Array is used to store multiple values in single variable to save the memory.
	public static void main(String[] args) {
	int a[] = {1,2,4,6,8,10}; // integer array
	String b[] = {"John", "Peter"}; // String array
	Object c[]= {1,2,"John",true,'a',3>9}; //Object array(Store data of any data type)
	
	System.out.println(a[0]); // 1
	System.out.println(a[2]); // 4
	System.out.println(b[0]); //John
	System.out.println(c[3]);
	System.out.println(b[3]); // ArrayIndexOutOfBondException
	
	
	
	

	}

}
