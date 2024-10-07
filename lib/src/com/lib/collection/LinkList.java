package com.lib.collection;

import java.util.LinkedHashSet;

public class LinkList
{
	public static void main(String[] args) 
	{
		LinkedHashSet<Object> l1 = new LinkedHashSet<Object>();
		l1.add(2);
		l1.add(59);
		l1.add(95);
		l1.add(null);
		l1.add("hello");
		l1.add(5.8);
		l1.add(95);
		System.out.println(l1);
		//retriving thorugh for-each loop
		for(Object o1:l1)
		{
			System.out.println(o1);
		}
	}

}
