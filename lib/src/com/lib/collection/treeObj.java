package com.lib.collection;

import java.util.*;

//TreeSet with comparator / Customized sorting

class Trainer implements Comparator<Integer>
{
	@Override 
	public int compare(Integer t1 , Integer t2)
	{
		return t2-t1;
	}
}
public class treeObj
{
	public static void main(String[] args) 
	{
		
		TreeSet<Integer> ts1= new TreeSet<Integer>(new Trainer());
		ts1.add(16);
		ts1.add(23);
		ts1.add(32);
		ts1.add(25);
		ts1.add(31);
		ts1.add(14);
		System.out.println(ts1);
		Iterator<Integer> i1 = ts1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}
}
