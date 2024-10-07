package com.lib.collection;
import java.util.ArrayList;
import java.util.HashSet;

public class HashsetArray 
{
      public static void main(String[] args) 
      {
		HashSet<Integer> h1 = new HashSet<Integer>();
		h1.add(5);
		h1.add(6);
		h1.add(59);
		h1.add(47);
		h1.add(51);
		h1.add(6);
		System.out.println("hashset :" + h1);
		ArrayList<Integer> a1 = new ArrayList<Integer>(h1);
		System.out.println("ArrayList :"+ a1);
		System.out.println(a1.get(2));
		
	}
}
