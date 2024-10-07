package com.lib.hashmap;
import java.util.*;

public class HM 
{
	public static void main(String[] args)
	{
		HashMap<Integer, String> h1 = new HashMap<Integer, String>();
		h1.put(11, "tushar");
		h1.put(22, "prajwal");
		h1.put(33,"vishal");
		h1.put(44,"koresh");
		h1.put(55,"aditya");
		System.out.println(h1);
		Set<Integer> i1 =h1.keySet();
		for(Integer key : i1)
		{
			System.out.println(key + "--->"+ h1.get(key));
		}
	}
 
}
