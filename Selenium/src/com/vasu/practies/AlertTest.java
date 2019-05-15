package com.vasu.practies;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertTest {

	public static void main(String[] args) throws Exception 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://primusbank.qedgetech.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("txtuId")).sendKeys("Admin");
		driver.findElement(By.name("txtPword")).sendKeys("vasu");
		driver.findElement(By.name("login")).click();
		
		Alert al=driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(al.getText());
		al.accept();//ok
	//	al.dismiss();//cancel
		//al.getText();//capture text
	//	al.sendKeys("vasu");//enter text

	}

}
