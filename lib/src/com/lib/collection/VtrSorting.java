package com.lib.collection;

import java.util.Collections;
import java.util.Vector;

public class VtrSorting 
{
  public static void main(String[] args) 
  {
		Vector<Integer> v1 = new Vector<Integer>();
		v1.add(5);
		v1.add(95);
		v1.add(48);
		v1.add(27);
		v1.add(67);
		System.out.println("before sorting vector list : " + v1);
		Collections.sort(v1);
		System.out.println("after soting vector list :" + v1);
		Collections.reverse(v1);
		System.out.println("reversed  vector list :" + v1);
		
	
  }
}
