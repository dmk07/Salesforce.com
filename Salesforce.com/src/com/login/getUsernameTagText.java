package com.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class getUsernameTagText {
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

public void getText()
{
		String str=driver.findElement(By.id("username")).getText();
		System.out.println(str);
}

	public static void main(String[] args) {
		
		getUsernameTagText gettext=new getUsernameTagText();
		gettext.LaunchAUT();
		gettext.getText();

	}

}
