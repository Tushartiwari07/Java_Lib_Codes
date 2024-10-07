package com.lib.exception;
public class MultiCatch
{
   public void test(int t)
   {
	   try {
	   int res=100/t;
	   System.out.println(res);
	   int [] t1= {16,24,28,};
	   System.out.println(t1[t]);
	
	   }
	   catch(ArithmeticException ae)
	   {
		   ae.printStackTrace();
		   System.out.println(" Arithmetic Exception exception is handled by programer");
	   }
	   catch(ArrayIndexOutOfBoundsException ar)
	   {
		   ar.printStackTrace();
		   System.out.println(" ArrayIndexOutOfBounds Exception exception is handled by programer");
	   }
	
   }
   public static void main(String[] args)
   {
	MultiCatch mc = new MultiCatch();
	mc.test(10);
	mc.test(5);
	mc.test(0);
   
   }
}
