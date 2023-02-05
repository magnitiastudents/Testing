package com.qa.webdriver;

public class Test10 {

	public static void main(String[] args) {
		
		//way-1
		Test8 x = new Test9();
		x.method1();
		x.method2();
		
		//way-2
		Test9 y= new Test9();
		y.method1();
		y.method2();
		y.method3();

	}

}
