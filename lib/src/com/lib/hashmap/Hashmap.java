package com.lib.hashmap;
import java.util.*;
class Student
{
	String sname;
	int sid;
	public Student(String sname, int sid)
	{
		this.sname=sname;
		this.sid=sid;
	}
	public String toString()
	{
		return "Student name : "+sname+" "+" Student Id : "+sid;
		
	}
}

public class Hashmap
{
	public static void main(String[] args)
	{
		Student s1 = new Student("tushar",16);
		Student s2 = new Student("prajwal",28);
		Student s3 = new Student("koresh",29);
		Student s4 = new Student("vishal",22);
		Student s5 = new Student("vishu",31);
		HashMap<Student, Double>h1 = new HashMap<Student, Double>();
		h1.put(s1, 67.9);
		h1.put(s2, 45.5);
		h1.put(s3, 72.8);
		h1.put(s4, 61.26);
		h1.put(s5, 89.0);
		Set<Student>S1=h1.keySet();
		for(Student key:S1)
		{
			System.out.println(key + " Marks of student :  "+ h1.get(key));
		}
		
		
		
		
	}

}
