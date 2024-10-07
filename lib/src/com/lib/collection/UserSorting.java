package com.lib.collection;

import java.util.*;
class Student 
{
	String name;
	int id;
	public Student(String name, int id)
	{
		this.name = name;
		this.id = id;
	}
	@Override
	public String toString()
	{
		return "Student name : " + name + "Student ID : "+ id;
	}	
}

public class UserSorting 
{
   public static void main(String[] args) 
   {
	   Student s1 = new Student("java", 11);
	   Student s2 = new Student("java", 22);
	   Student s3 = new Student("java", 33);
	   Student s4 = new Student("java", 44);
	   Student s5 = new Student("java", 55);
	ArrayList<Student>slist= new ArrayList<Student>();
	      slist.add(s4);
	      slist.add(s1);
	      slist.add(s3);
	      slist.add(s5);
	      slist.add(s2);
	      System.out.println(slist); 
   }
}
