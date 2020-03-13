package com.exception;

public class SyntexErronFind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []x= {};
		int a=5,b=6;
		try
		{
			System.out.println(x[a/b]);
		}catch(ArithmeticException e)
		{
			System.out.println(a);
		}
		catch(Exception e)
		{
			System.out.println(b);
		}

	}

}
