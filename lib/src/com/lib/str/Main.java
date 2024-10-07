package com.lib.str;

public class Main 
{
public static void main(String[] args) 
{
	String str ="hello java";
	System.out.println(str);
	//methods of string class
	System.out.println("length ="+ str.length());
	
	System.out.println(str.charAt(1));
	
	System.out.println(str.indexOf('l'));
	System.out.println(str.indexOf('j',0));
	
	System.out.println(str.equals("hello"));
	System.out.println(str.equals("Hello"));
	System.out.println(str.equalsIgnoreCase("HELLO"));
	
	System.out.println(str.substring(0,4));
	System.out.println(str.substring(5,9));
}

}

