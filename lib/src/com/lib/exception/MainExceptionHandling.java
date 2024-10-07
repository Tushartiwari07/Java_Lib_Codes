package com.lib.exception;

public class MainExceptionHandling 
{

	   public void test (int a)
	   {
		  try
		  { 
		   int res = 100/a;
		   System.out.println(res);
		  }
		  catch(Exception e1)
		  {
			e1.printStackTrace();  
		  }
	   }
	   public static void main(String[] args) 
	   {
		   MainExceptionHandling m2 = new MainExceptionHandling();
		   m2.test(1);
		   m2.test(0);//java.lang.ArithmeticException:
	       m2.test(9);
	}

}
