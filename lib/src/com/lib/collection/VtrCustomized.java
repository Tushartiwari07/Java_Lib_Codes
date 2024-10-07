package com.lib.collection;

import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

class Vtr implements Comparator<Integer>
{

	@Override
	public int compare(Integer i1, Integer i2)
	{
	
		return i1-i2;
	}
	
}
public class VtrCustomized 
{
     public static void main(String[] args)
     {
	   Vector<Integer> v2 = new Vector<Integer>();
	   v2.add(25);
	   v2.add(86);
	   v2.add(19);
	   v2.add(56);
	   System.out.println("before sorting vector list : " + v2);
	   Collections.sort(v2, new Vtr());
	   System.out.println("After sorting vector list : " + v2);
	   
	}
}
