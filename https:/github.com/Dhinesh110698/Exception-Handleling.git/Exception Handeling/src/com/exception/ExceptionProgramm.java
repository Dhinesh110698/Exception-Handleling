package com.exception;

public class ExceptionProgramm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=2;
		ExceptionProgramm  p=new ExceptionProgramm ();
		try
		{
			a=p.getmark(5,0);
		}
		catch(Exception e)
		{
			try
			{
			a=p.getmark(5,a);
		}
			catch(Exception r )
			{
				System.out.println("find");
			}
		}
		System.out.println(a);

	}

	int getmark(int a, int b)throws Exception {
		// TODO Auto-generated method stub
		try
		{
			return a/b;
		}
		catch(Exception e)
		{
			throw e;
		}finally
		{
		System.out.println(a+b);
	}

}
}