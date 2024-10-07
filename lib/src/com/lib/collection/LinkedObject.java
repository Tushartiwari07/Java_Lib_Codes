package com.lib.collection;

import java.util.*;
class Labour implements Comparator<Labour>
{
	String name ;
	int id;
	public Labour(String name, int id) 
	{
		this.name = name;
		this.id = id;
	}
	@Override
	public String toString()
	{
		return "Labour name : " + name  +"   "	+ "Labour ID : " + id;
				
	}
	@Override
	public int compare(Labour l1, Labour l2)
	{
		return l1.name.compareTo(l2.name);
	}
	
}

public class LinkedObject 
{
   
	public static void main(String[] args)
    {
		Labour l1 = new Labour("ab", 27);
		Labour l2 = new Labour("aba", 22);
		Labour l3 = new Labour("cba", 19);
		Labour l4 = new Labour("dac", 60);
		Labour l5 = new Labour("bca", 9);
		LinkedHashSet<Labour> lh = new LinkedHashSet<Labour>();
		lh.add(l5);
		lh.add(l3);
		lh.add(l1);
		lh.add(l4);
		lh.add(l2);
		System.out.println( lh);
		ArrayList<Labour>  a1 = new ArrayList<Labour>(lh);
		Collections.sort(a1 ,l1);
			//	System.out.println("After Sorting : " +a1);
				for (Labour l7 : a1  )
				{
					System.out.println("After sorting in  : "+  l7);
				}
    }
}

