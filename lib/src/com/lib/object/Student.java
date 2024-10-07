package com.lib.object;
public class Student
{
	String name;
	double marks;
	public Student(String name, double marks)
	{
		this.name=name;
		this.marks=marks;
	}
	public boolean equals(Object obj)
	{
		Student std=(Student)obj;
		if(this.marks>std.marks)
		{
			return true;
			
		}
		else 
		{
			return false;
		}
	}
	public static void main(String[] args) 
	{
		   Student s1=new Student("tushar",85.64);
		   Student s2 =new Student("vishal", 80.57);
	   System.out.println(s1.equals(s2));
	   System.out.println(s2.equals(s2));
	}
}
