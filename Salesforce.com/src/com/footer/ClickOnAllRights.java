package com.footer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ClickOnAllRights {
	
	static {
		//Dipak
				System.setProperty("webdriver.edge.driver", "C://msedgedriver.exe");
				// dont create obj in static block you cant acess in local blcok
			}
	
	
	WebDriver driver=new EdgeDriver();
	
	public void LaunchAUT()
	{
		driver.manage().window().maximize();
		driver.navigate().to("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=jumbo1-btn-ft");
		// driver.get("uRL");
		driver.manage().window().maximize();
	}
	
	public void clickonAllRights()
	{
		driver.findElement(By.xpath("/html/body/footer/div/div[1]/div/div/div/div/div[2]/div/p/a")).click();
	}
	
	public static void main(String args[])
	{
		ClickOnAllRights obj=new ClickOnAllRights();
		obj.LaunchAUT();
		obj.clickonAllRights();
	}

}
