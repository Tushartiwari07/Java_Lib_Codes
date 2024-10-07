package com.lib.collection;

import java.util.*;
/* ADD ELEMENTS TO THE ARRAYLIST AND REMOVE DUPLICATES AND SORT IN ASCENDING ORDER */
public class HashSetArrayQ 
{
     public static void main(String[] args) 
     {
    	 ArrayList<Integer> a1 = new ArrayList<Integer>();
		
		a1.add(97);
		a1.add(69);
		a1.add(37);
		a1.add(17);
		a1.add(29);
		//a1.add(null);
		a1.add(69);
		//a1.add(null);
		a1.add(17);
		System.out.println("ArrayList :"+ a1);
		HashSet<Integer> h1 =new HashSet<Integer>(a1);
		h1.add(12);
		System.out.println("HashList after removing duplicates :" +h1);
		ArrayList<Integer> a2 = new ArrayList<Integer>(h1);
		Collections.sort(a2);
		System.out.println(a2);
	}
}
