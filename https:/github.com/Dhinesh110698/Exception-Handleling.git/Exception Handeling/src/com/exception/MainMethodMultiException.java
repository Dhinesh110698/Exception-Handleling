package com.exception;

public class MainMethodMultiException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MainMethodMultiException M=new  MainMethodMultiException();
			try
			{ 
				M.work();
			}
			catch(ArithmeticException e)
			{
				System.out.println("Arithmatic Exception");
			}
				catch(ArrayIndexOutOfBoundsException r)
				{
					System.out.println("Array Index Bound Exception");
				}
		}

		private void work() throws ArithmeticException,ArrayIndexOutOfBoundsException{
			// TODO Auto-generated method stub
		int a=5;
		int b=0;
		int k[]= {5,6,7};
			try {
				System.out.println(5/0);
				System.out.println(a/k[a]);
			}
			catch(ArithmeticException e)
			{
				//System.out.println("eroor");
				throw e;
			}
				catch(ArrayIndexOutOfBoundsException r)
				{
					throw r;
				}
			finally
			{
			System.out.println("end of programm");
		}
	}

}
