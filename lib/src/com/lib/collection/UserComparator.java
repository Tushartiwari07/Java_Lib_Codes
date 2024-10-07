package com.lib.collection;
import java.util.*;
	class Student1 implements Comparator<Student1>
	{
		String sub;
		int id;
		public Student1(String sub, int id)
		{
			this.sub = sub;
			this.id = id;
		}
		@Override
		public String toString()
		{
			return "Student sub : " + sub + " Student ID : "+ id;
		}
		@Override
		public int compare(Student1 s1, Student1 s2) 
		{
		
			return s1.id-s2.id;
		}	
	}
	public class UserComparator 
	{
	   public static void main(String[] args) 
	   {
		   Student1 s1 = new Student1("java", 11);
		   Student1 s2 = new Student1("sql", 22);
		   Student1 s3 = new Student1("html", 33);
		   Student1 s4 = new Student1("css", 44);
		   Student1 s5 = new Student1("js", 55);
		ArrayList<Student1>slist= new ArrayList<Student1>();
		      slist.add(s4);
		      slist.add(s1);
		      slist.add(s3);
		      slist.add(s5);
		      slist.add(s2);
		      System.out.println(slist); 
		     Collections.sort(slist, s1);
		     System.out.println(slist);
	   }
	}

