package com.lib.wrapper;

public class Example
{
	public static void main(String[] args)
	{
		int i=25;  //primitive
		Integer i1=i;
		//or
		Integer i2=Integer.valueOf(i);//converting primitive to java object(Autoboxing)
		System.out.println(i);
		
		Integer i3=90;//java object
		int i4=i3.intValue();//converting java object to primitive(unboxing)
		System.out.println(i3);
	}

}
