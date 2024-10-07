package com.lib.exception;
class InsufficientbalException extends Exception
{
	public InsufficientbalException(String msg)
    {
		super(msg);
    }
}
class InvalidTransactionException extends RuntimeException
{
	public InvalidTransactionException(String msg)
	{
		super(msg);
	}
}
class Account
{
	double bal;
	long accno;
	String owner;
	public Account(long accno,String owner)
	{
		this.accno=accno;
		this.owner=owner;
	}
	public void deposit(double amt)
	{
		if(amt>=0)
		{
			bal=bal+amt;
			System.out.println("Current bal = " + bal);
		}
		else
		{
			try
			{
				throw new InvalidTransactionException("Nevigate amt is not allowed");
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
	public void withdraw(double amt)
	{
		if(bal>=amt && amt>=0)
		{
			bal=bal-amt;
			System.out.println("Current bal = "+ bal);
		}
		else
		{
			try
			{
				throw new InvalidTransactionException("bal not found in account");
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
public class CustomizedExeption 
{   
	public static void main(String[] args) 
   {    
		Account a1= new Account(5166856446l,"abc");
		a1.deposit(16000.0);
		a1.deposit(-400);
		a1.withdraw(6000);
		a1.withdraw(50000);
	
  }

}
