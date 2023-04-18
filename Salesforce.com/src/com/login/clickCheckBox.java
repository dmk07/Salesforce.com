package com.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class clickCheckBox {
	static {
		//Dipak
				System.setProperty("webdriver.edge.driver", "C://msedgedriver.exe");
				// dont create obj in static block you cant acess in local blcok
			}
	
	
	WebDriver driver=new EdgeDriver();
	
	public void LaunchAUT()
	{
		driver.manage().window().maximize();
		driver.navigate().to("https://login.salesforce.com/?locale=in");
		// driver.get("uRL");
		driver.manage().window().maximize();
	}
	
	public void clickCheckBoxByid() throws InterruptedException
	{
		driver.findElement(By.id("rememberUn")).click();
		Thread.sleep(2000);
	}
	
	public void clickCheckBoxByname() throws InterruptedException
	{Thread.sleep(2000);
		driver.findElement(By.name("rememberUn")).click();
	}
	
	public void clickCheckBoxBytype() throws InterruptedException
	{Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {

		clickCheckBox click=new clickCheckBox();
		click.LaunchAUT();
		click.clickCheckBoxByid();
		click.clickCheckBoxByname();
		click.clickCheckBoxBytype();
		
		
	}

}
