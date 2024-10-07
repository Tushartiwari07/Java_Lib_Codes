package com.lib.collection;

import java.util.*;

public class Vectorr
{
	public static void main(String[] args) 
	{
		Vector<Integer> v1 = new Vector<Integer>();
		v1.add(5);
		v1.add(95);
		v1.add(48);
		v1.add(27);
		v1.add(69);
		System.out.println(v1);
		for(int i =0; i<=v1.size()-1;i++)
		{
			System.out.println(v1.get(i));
		}
		
	}

}
