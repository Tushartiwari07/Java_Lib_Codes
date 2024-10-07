package com.lib.collection;

import java.util.TreeSet;
//TreeSet with Default Comparable
public class Tset 
{
     public static void main(String[] args) 
     {
		TreeSet<Integer> t1 = new TreeSet<Integer>();
		t1.add(25);
		t1.add(9);
		t1.add(48);
		t1.add(32);
		t1.add(64);
		t1.add(49);
		t1.add(91);
		System.out.println(t1);
		
	}
}
