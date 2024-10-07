package com.lib.str;

public class Sample {

	public static void main(String[] args)
	{
		String s1="hello";
		String s2="hello";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.equals(s2));
	}

}
