package com.qa.javabasics;

public class Test10 {
	
	//properties
	private int x;     // current class only
	
	protected int y;	// current class and child classes
	 
	int  z;				// default for current package level
	
	public int w;		// for project level
	
	
	public void method1()
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(w);
	}

}
