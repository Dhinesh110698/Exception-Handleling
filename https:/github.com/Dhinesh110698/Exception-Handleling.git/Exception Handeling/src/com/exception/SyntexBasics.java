package com.exception;

public class SyntexBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k[] = { 5, 6, 7 };
		int a = 15;
		int b = 2;
		int c = -1;
		try {
			c = a / b;
			System.out.println(k[c]);
		} catch (ArithmeticException e) {
			System.out.println(c);
		} catch (ArrayIndexOutOfBoundsException w) {
			try {
				System.out.println(k[a]);
			} catch (ArrayIndexOutOfBoundsException r) {
				System.out.println("k");
			}
			System.out.println("hello");
		}

	}

}
