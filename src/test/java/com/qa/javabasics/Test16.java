package com.qa.javabasics;

public class Test16 {
	
	public int x;
	
	public float y;
	
	public char z;
	
	public boolean w;
	 
	public String s;
	
	
	public Test16(int a)
	{
		x=a;
		y=10.4f;
		
	}
	
	
	public Test16(String a)
	{
		s=a;
		z='R';
	}
	
	
	public Test16(int a , String b)
	{
		x=a;
		s=b;
		w=true;
	}

	public Test16(String a , int b)
	{
		s=a;
		x=b;
		z='T';
	}
	
	
	public Test16(int a, float b, char c, boolean d ,String e)
	{
		
	}
}
