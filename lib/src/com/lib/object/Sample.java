package com.lib.object;

public class Sample 
{
public static void main(String[] args)
{
	Sample s1=new Sample();
	Sample s2= new Sample();
	//execution of  hashCode methods of object class
	System.out.println("--------hashCode() of object class--------");
	System.out.println(s1.hashCode());
	System.out.println(s2.hashCode());
	//execution of  toString methods of object class
	System.out.println("---------toString() of object class---------");
	System.out.println(s1);
	       //or
	System.out.println(s1.toString());
	System.out.println(s2.toString());
	System.out.println("----------equal(object) method of object class-----------");
	System.out.println(s1.equals(s2));
}
}
