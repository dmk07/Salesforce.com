package com.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginByxpath {

	static {
	
		System.setProperty("webdriver.edge.driver", "C://msedgedriver.exe");
		// dont create obj in static block you cant acess in local blcok

	}

	WebDriver driver = new EdgeDriver();

// launch the browser with url
	public void LaunchAUT() throws InterruptedException {
		driver.manage().window().maximize();
		driver.navigate().to("https://login.salesforce.com/?locale=in");
		// driver.get("uRL");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}

	public void testLoginByxpath() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@id='username']"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Login']")).click();		
		
	}
	
	public static void main(String[] args) throws InterruptedException {

		LoginByxpath test=new LoginByxpath();
		test.LaunchAUT();
		test.testLoginByxpath();
		
		
		
	}

}
