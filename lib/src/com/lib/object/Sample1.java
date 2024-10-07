package com.lib.object;

public class Sample1 
{
@Override
public int hashCode()
{
	return 29271624;
}
@Override
public String toString()
{
	return "hello object";
}
@Override
public boolean equals(Object obj)
{
	return true;
}
public static void main(String[] args)
{
	Sample1 s1=new Sample1();
	Sample1 s2=new Sample1();
	//execution of overridden methods of object class in sample class
	System.out.println("-------overridden hashCose () of object class is working------");
	System.out.println(s1.hashCode());
	System.out.println(s2.hashCode());
	System.out.println("-------overridden toString () of object class is working------");
	System.out.println(s1);
	System.out.println(s2.toString());
	System.out.println("-------overridden equals(object) () of object class is working------");
	System.out.println(s1.equals(s2));
}
}
