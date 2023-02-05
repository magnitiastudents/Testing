package com.qa.javabasics;

public class Test3 {

	public static void main(String[] args) {
	
		int x= 10;  // x used as variable (primitive data type)
		
		
		int[] y= {10,20,30,40};			//y used as variable and object (Derived Data type)
		System.out.println(y[0]);
		System.out.println(y[1]);
		System.out.println(y[2]);
		System.out.println(y[3]);
		
		System.out.println(y.length); 
		
		String z="kalam";				// z used as variable and object (Derived Data type)
		System.out.println(z);
		System.out.println(z.length());
		
		char[] c= {'k','a','l','a','m'};  // c used as variable and object (Derived Data type)
		System.out.println(c.length);
	}

}
