package com.vasu.java;

import java.util.Scanner;

public class IfStatement {

	public static void main(String[] args)
	{
		// prgm to check the given no is even / odd 
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		//int n=50;
		
		if (n%2==0)
		{
		System.out.println("Even Number");	
		}else
		{
			System.out.println("Odd Number");
		}

	}

}
