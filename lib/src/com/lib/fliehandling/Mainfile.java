package com.lib.fliehandling;

import java.io.*;
import java.util.Scanner;

public class Mainfile 
{
	public static void main(String[] args) 
	{
		File file = new File("myFile.txt");
		try
		{
			//Create
			file.createNewFile();
			//write
			FileWriter fw = new FileWriter(file);
			fw.write("hello java hello java  bye java hello all of you how are you guys everything ok just say all is well");
			fw.write("  bye java");
			fw.close();
//			// Using Scanner 
//			Scanner sc = new Scanner(file);
//			while(sc.hasNext());
//			{
//				System.out.println(sc.nextLine());
//			}
//			sc.close();
//			// Using File Reader 
			FileReader fr = new FileReader(file);
			int i=0;
			while((i=fr.read())!=-1)
			{
				System.out.println((char)i);
			}
				fr.close();
		
//		 //Using BufferedReader
//		FileReader fr1 = new FileReader(file);
//		BufferedReader br = new BufferedReader(fr1);
//		String str="";
//		while((str=br.readLine())!=null)
//		{
//			System.out.println(str);
//		}
//               fr1.close();
//               br.close();
    	}
		catch(Exception e1)
		{
			e1.printStackTrace();
		}
	}

}
