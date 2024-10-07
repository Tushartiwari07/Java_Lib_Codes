package com.lib.collection;

import java.util.*;

public class PreSorting1 
{
	
	  public static void main(String[] args) 
	  {
		ArrayList<Integer> a1= new ArrayList<Integer>();
		a1.add(75);
		a1.add(64);
		a1.add(92);
		a1.add(26);
		System.out.println("Before Sorting " + a1);
//		Collections.sort(a1);
//		/*Internally it go to Integer class which is already Implementing Camparable Interface
//		*which contains CampareTo()
//	   /*collections.sort(List<t>ref) will use
//	    * CompareTo () to sort the elements */
//		System.out.println("After Sorting " + a1);
		//Reverse the given string
		Collections.sort(a1,Collections.reverseOrder());
		System.out.println(" After sorting reversed list : " +a1);
		
	  }
	}

