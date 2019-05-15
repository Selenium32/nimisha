package com.vasu.excel;

public class Methods 
{

	public  void add(int i,int j)
	{
		
		int sum= i+j;
		System.out.println(sum);
	}
	public static void main(String[] args) 
	{
		Methods v=new Methods();
		v.add(20,30);//calling method with method name// it won't return a value
		/*int res=v.add();//calling method with variable // it will return a value
		System.out.println(res);*/
		
	}
}
