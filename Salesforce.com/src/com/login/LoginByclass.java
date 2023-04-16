package com.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginByclass {
	static {
		//Dipak
				System.setProperty("webdriver.edge.driver", "C://msedgedriver.exe");
				// dont create obj in static block you cant acess in local blcok

			}
			
	WebDriver driver=new EdgeDriver();

// launch the browser with url
public void LaunchAUT()
{
	driver.manage().window().maximize();
	driver.navigate().to("https://login.salesforce.com/?locale=in");
	// driver.get("uRL");
	driver.manage().window().maximize();
}

//test login functionality

public void testLogin()
{
	driver.findElement(By.name("input r4 wide mb16 mt8 username")).sendKeys("dipak100kadam@gmail.com"); // class locator value alwasy changes
	driver.findElement(By.name("input r4 wide mb16 mt8 password")).sendKeys("dklajf");
	driver.findElement(By.name("button r4 wide primary")).click();
}



public static void main(String[] args) {

	
	LoginByid test=new LoginByid();
	test.LaunchAUT();
	test.testLogin();
	
	
	
}
	
}
