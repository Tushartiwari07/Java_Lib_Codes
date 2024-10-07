package com.lib.collection;

import java.util.ArrayList;

public class ColMethods 
{
   public static void main(String[] args) 
   {
	   //ArrayList 1
	ArrayList<Object>a1 = new ArrayList<Object>();
	a1.add(24);
	a1.add(null);
	a1.add("Tushar");
	a1.add("hi");
	  //ArrayList 2
	ArrayList<Integer> a2 = new ArrayList<Integer>();
	a2.add(07);
	a2.add(16);
	 System.out.println(a1);
	 //adding the element based on index
	 a1.add(1, "mahi");
	 System.out.println(a1);
	 //adding  1 list to another list elements will be added at the last
	 a1.addAll(a2);
	 System.out.println(a1);
	 // adding all the elements of one list to another based on index
	 a1.addAll(2, a2);
	 System.out.println(a1);
	 // to remove the index based on the index
	 a1.remove(4);
	 System.out.println(a1);//4TH Index element null is removed  
	 //to remove based on the element
	 a1.remove("hi");
	 System.out.println(a1);
	 // to check element present or not
	 System.out.println(a1.contains(7));
	 System.out.println(a1.contains("Tushar"));
	 // Used to removeAll elements of another object
	 a1.removeAll(a2);
	 System.out.println(a1);
	 //Used to clear all element
	 a1.clear();
	 System.out.println(a1);
	 
	
	
   }
}
