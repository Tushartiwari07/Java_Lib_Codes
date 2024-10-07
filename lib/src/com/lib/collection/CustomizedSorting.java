package com.lib.collection;

import java.util.*;
class Sorting implements Comparator<Integer>
{

	@Override
	public int compare(Integer i1, Integer i2)
	{
		
		return i1-i2;
	}
	
}

public class CustomizedSorting 
{
  public static void main(String[] args) 
  {
	  ArrayList<Integer> a1= new ArrayList<Integer>();
		a1.add(75);
		a1.add(64);
		a1.add(92);
		a1.add(12);
		System.out.println("Before Sorting " + a1);
		Collections.sort(a1,new Sorting());
		System.out.println("After Sorting " + a1);
		
  }
}
