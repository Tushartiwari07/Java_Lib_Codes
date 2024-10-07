package com.lib.collection;

import java.util.*;
//import java.lang.*;
class Employee5 implements Comparator<Employee5>
{
	int empid;
	String name;
	public Employee5(int empid, String name)
	{
		this.empid=empid;
		this.name=name;
	}
	public String toString()
	{
		return "Employee name : " + name + "  empId : " + empid ;
	}
	
   public int compare(Employee5 i1, Employee5 i2)
   {
	   return i1.empid-i2.empid; //ascending based on empid
//	   return i1.name.compareTo(i2.name);
   }
}
public class TreeObj1
{
      public static void main(String[]args) 
      {
		Employee5 e1 = new Employee5(13,"tushar");
		Employee5 e2 = new Employee5(9,"prajwal");
		Employee5 e3 = new Employee5(5,"vishal");
		Employee5 e4 = new Employee5(2,"sumeeth");
		TreeSet<Employee5> t1 = new TreeSet<Employee5>(e1);
		t1.add(e4);
		t1.add(e2);
		t1.add(e1);
		t1.add(e3);
		System.out.println(t1);	
		Iterator<Employee5> i1  = t1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
	}
}
