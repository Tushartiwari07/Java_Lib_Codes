package com.lib.collection;

import java.util.*;

public class UserSorting1 implements Comparable<UserSorting1>
{
	int id;
	
	public UserSorting1(int id)
	{
		super();
		this.id = id;
	}
@Override
  public int compareTo(UserSorting1 us) 
  {

	return this.id-us.id;
  }
  @Override
public String toString() 
  {
	return "Userid " + id ;

  }
public static void main(String[] args) 
  {
	  UserSorting1 u1 =new UserSorting1(5);
	  UserSorting1 u2 = new UserSorting1(9);
	  UserSorting1 u3 = new UserSorting1(3);
	  UserSorting1 u4 = new UserSorting1(11);
	
	  ArrayList<UserSorting1> a1= new ArrayList<UserSorting1>();
	       a1.add(u1);
	       a1.add(u4);
	       a1.add(u2);
	       a1.add(u3);
		System.out.println("Before Sorting " + a1);
		Collections.sort(a1);
		System.out.println("after Sorting " + a1);
		}
}
