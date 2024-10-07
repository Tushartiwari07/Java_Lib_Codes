package com.lib.collection;

import java.util.*;
class Employee implements Comparable<Employee>
{
       String empname;
       int empid;
       public Employee(String empname, int empid )
       {
    	   this.empname=empname;
    	   this.empid=empid;
       }
	@Override
	public String toString() {
		return "Employee empname=" + empname + ", empid=" + empid ;
	}
	@Override
	public int compareTo(Employee e1) 
	{
	
		return this.empid-e1.empid;    //ascending based on empid
		//return e1.empid-this.empid; //decending based on empid
        //return e1.empname.compareTo(this.empname);decending based on empname
		// this.empname.compareTo(e1.empname);// Ascending based on empname
	}
}
public class VtrUserDefine
{
    public static void main(String[] args) 
    {
		Employee e1 = new Employee("Vishal", 22);
		Employee e2 = new Employee("Prajwal", 28);
		Employee e3 = new Employee("Tushar", 16);
		Employee e4 = new Employee("Sumeeth", 31);
		Employee e5 = new Employee("Vishu", 69);
		Vector<Employee> v1= new Vector<Employee>();
		v1.add(e5);
		v1.add(e3);
		v1.add(e1);
		v1.add(e4);
		v1.add(e2);
		System.out.println("Before sorting : " +v1);
		Collections.sort(v1);
		System.out.println("After sorting : " +v1);
		for(int i=0;i<=v1.size()-1;i++)
		{
			System.out.println(v1.get(i));
		}
	}
}
