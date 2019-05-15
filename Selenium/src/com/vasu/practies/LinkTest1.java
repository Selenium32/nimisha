package com.vasu.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTest1 {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		
	List<WebElement> links=driver.findElements(By.tagName("a"));
	System.out.println(links.size());
	for (int i = 0; i < links.size(); i++) 
	{
		//System.out.println(links.get(i).getText());
		if (links.get(i).getText().equals("REGISTER")) 
		{
			links.get(i).click();
		}
	}

	}

}
