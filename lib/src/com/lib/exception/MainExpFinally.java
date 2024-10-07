package com.lib.exception;
public class MainExpFinally 
{   
	public void test(int a)
	{
		try 
		{
		int res =100/a;
		System.out.println(res);
	    }
		catch(Exception e1)
		{
			e1.printStackTrace();
		}
		finally 
		{
			try
			{
				int[]a1= {28,31,22};
				System.out.println(a1[a]);
			}
			catch(Exception e1)
			{
				e1.printStackTrace();
			}
			
		}
	}
	public static void main(String[] args) 
	{
		MainExpFinally mf=new MainExpFinally();
		mf.test(0);
		mf.test(1);
		mf.test(5);
	}
}
