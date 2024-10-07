package com.lib.exception;
class StudentUnavalableException extends Exception implements Student
{
	public StudentUnavalableException(String msg)
	{
		super(msg);
	}

	@Override
	public void tushar()
	{
		// TODO Auto-generated method stub
		//System.out.println("Student id absent");
	}
}
interface Student
{
	public void tushar();
}
class Jspider implements Student
{
	public void tushar()
	{
		System.out.println("Tushar is attending class in Jspiders");
	}
}
class  Qspiders implements Student
{
	public  void tushar()
	{
		System.out.println("Tushar is attending class in Qspiders");
	}
}
class TrackStudent
{
	public Student track(int pin)
	{
		if(pin==1234)
		{
			Student j1= new Jspider();
			return j1;
		}
		else if(pin==4321)
		{
			Student q1 = new Qspiders();
			return q1;
		}
		else
		{
			try 
			{
		         throw new StudentUnavalableException("Student id absent today");
			}
			catch(Exception e)
			{
				e.printStackTrace();
				
			}
			Student s1 = new StudentUnavalableException("");
			return s1;
		}
	}
}

public class CustException 
{
   public static void main(String[] args) 
   {
	   TrackStudent t1 = new TrackStudent();
	   Student s1 =t1.track(1234);
	   s1.tushar();
	   TrackStudent t2 = new TrackStudent();
	    Student s2=t1.track(4321);
	    s2.tushar();
	    TrackStudent t3 = new TrackStudent();
	    Student s3=t3.track(455);
	    s3.tushar();
	    
	    
	
   }
}
