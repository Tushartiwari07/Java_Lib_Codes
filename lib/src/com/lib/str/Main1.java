package com.lib.str;

public class Main1 
{
  public static void main(String[] args)
  {
	String s1="this_is java class ";
	String []Sarray=s1.split(" ");
	
	
	for(int i=0; i<=Sarray.length-1;i++)
	{
		System.out.println(Sarray[i]);
	}
}
}
