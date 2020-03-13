package com.exception;

public class MainMethodException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MainMethodException M=new  MainMethodException();
		try
		{ 
			M.work();
		}catch(Exception e)
		{
			System.out.println("error find");
		}

	}

	private void work() throws Exception{
		// TODO Auto-generated method stub
		try {
			System.out.println(5/0);
		}
		catch(Exception e)
		{
			//System.out.println("eroor");
			throw e;
		}finally
		{
		System.out.println("end of programm");
	}

}
}