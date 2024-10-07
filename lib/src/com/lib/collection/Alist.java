package com.lib.collection;

import java.util.ArrayList;

public class Alist 
{
	public static void main(String[] args) 
	{
		//ArrayList can store duplicates
		//ArrayList support multiple null values
		//ArrayList has Index
		//ArrayList preserve Insertion order 
		//Underlying Data Structure of ArrayList is "Resizable in order"
		//Create ArrayList
	    ArrayList al = new ArrayList();
	    //Add Elements(pre-define object)
	    al.add(69);
	    al.add('T');
	    al.add(null);
	    al.add(new Alist());
	    al.add("TUSHAR");
	    al.add(0.7);
	    al.add(null);
	    al.add('T');
	    al.add(56);
	    System.out.println(al);
	    // go to userdefine object which is present in Alist and call toString() which returns values
	    
	    //retrive it
	    for(int i=0; i<=al.size()-1;i++)
	    {
	    	System.out.println(al.get(i));
	    }
	}

}
