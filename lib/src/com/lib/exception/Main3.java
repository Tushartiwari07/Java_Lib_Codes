package com.lib.exception;

import java.io.IOException;

public class Main3 
{
	public void test() throws Exception
	{
		System.out.println("Exception is created explicity");
		throw new IOException();	
	}
	public static void main(String[] args)
	{
		Main3 m3= new Main3();
		try {
			m3.test();
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
