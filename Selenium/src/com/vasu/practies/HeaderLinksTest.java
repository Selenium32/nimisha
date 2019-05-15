package com.vasu.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HeaderLinksTest {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://bing.com");
		driver.manage().window().maximize();
		//header section
		WebElement header=driver.findElement(By.className("sw_tb"));
		//links under header section
		List<WebElement> headerLinks=header.findElements(By.tagName("a"));
		System.out.println(headerLinks.size());
		
		for (WebElement element : headerLinks) 
		{
			System.out.println(element.getText());
		}

	}

}
