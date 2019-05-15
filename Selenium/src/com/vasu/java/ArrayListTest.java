package com.vasu.java;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest 
{

	public static void main(String[] args)
	{
		List<String>  l=new ArrayList<>();
		l.add("Selenium");
		l.add("Vasu");
		l.add("ETL");
		l.add("Vasu");
		System.out.println(l.size());
		/*for (int i = 0; i < l.size(); i++) 
		{
			System.out.println(l.get(i));
		}*/
		for(String item:l)
		{
			System.out.println(item);
		}

	}

}
