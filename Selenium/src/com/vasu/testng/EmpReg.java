package com.vasu.testng;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class EmpReg extends OHRM
{
@Test
public void empReg() throws Exception
{
	driver.findElement(By.linkText("PIM")).click();
	driver.findElement(By.linkText("Add Employee")).click();
	driver.findElement(By.id("firstName")).sendKeys("santho345"); 
	driver.findElement(By.id("lastName")).sendKeys("Selenium"); 
	
	Thread.sleep(2000);
	driver.findElement(By.id("btnSave")).click();

}
}
