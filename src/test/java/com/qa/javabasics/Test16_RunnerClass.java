package com.qa.javabasics;

public class Test16_RunnerClass {

	public static void main(String[] args) {
	
		Test16 obj= new Test16(50);
		System.out.println(obj.x);
		
		Test16 obj1=new Test16("Hyderabad");
		System.out.println(obj1.s);

		
		Test16 obj2=new Test16(100,"Bangalore");
		System.out.println(obj2.x);
		System.out.println(obj2.s);
		
		Test16 obj3=new Test16("KIngKoti", 200);
		System.out.println(obj3.x);
		System.out.println(obj3.s);
	}

}
