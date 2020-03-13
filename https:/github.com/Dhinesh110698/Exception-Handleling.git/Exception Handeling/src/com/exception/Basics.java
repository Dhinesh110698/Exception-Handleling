package com.exception;

public class Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	int a=5,b=4;
		try
		{
			System.out.println(a/b);
		}
		catch(Exception e)
		{
			
		}
System.out.println("end");     */
		
		
		int a[]= { 5,6,7};
		int n=5; int b=0;
		try
		{
			System.out.println(n/b);
			System.out.println(a[n]);
		}
		catch(ArithmeticException e)
		{
			System.out.println("a");
		}
		catch(ArrayIndexOutOfBoundsException w)
		{
			System.out.println("b");
		}
	}

}
