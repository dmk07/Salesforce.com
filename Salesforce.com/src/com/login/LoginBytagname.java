package com.login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginBytagname {
	static {
		// Dipak
		System.setProperty("webdriver.edge.driver", "C://msedgedriver.exe");
		// dont create obj in static block you cant acess in local blcok

	}

	WebDriver driver = new EdgeDriver();

// launch the browser with url
	public void LaunchAUT() {
		driver.manage().window().maximize();
		driver.navigate().to("https://login.salesforce.com/?locale=in");
		// driver.get("uRL");
		driver.manage().window().maximize();
	}

//test login functionality

	public void testTagName() {
		
		//driver.navigate().to("https://login.salesforce.com/?locale=in");
		List<WebElement> web =driver.findElements(By.tagName("input"));

		for(WebElement element:web) {
			
					System.out.println(element.getText());
		}
	}



	public static void main(String[] args) {

		LoginBytagname test = new LoginBytagname();
		test.LaunchAUT();
		test.testTagName();
	}
}
