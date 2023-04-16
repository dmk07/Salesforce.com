package com.login;
//
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginByname {
	
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
	
	driver.findElement(By.name("username")).clear();
	driver.findElement(By.name("password")).clear();
	driver.findElement(By.name("username")).sendKeys("dipak100kadam@gmail.com");
	driver.findElement(By.name("pw")).sendKeys("dklajf");
	
	driver.findElement(By.name("Login")).click();
	

}



public static void main(String[] args) {

	
	LoginByname test=new LoginByname();
	test.LaunchAUT();
	test.testLogin();
	
	
	
}
	

}
