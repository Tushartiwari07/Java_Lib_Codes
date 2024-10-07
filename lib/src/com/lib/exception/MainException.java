package com.lib.exception;

public class MainException 
{
   public void test (int a)
   {
	   System.out.println("Test Starts.........");
	   int res = 100/a;
	   System.out.println(res);
	   System.out.println("test ends...........");
   }
   public static void main(String[] args) 
   {
	   System.out.println("Main starts.........");
	   MainException me = new MainException();
	   me.test(5);
	   me.test(0);//java.lang.ArithmeticException:
       me.test(10);	
       System.out.println("Main ends..................");
}
}
