package com.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ClickForgetPasswordLink {

	static {
		// Dipak
		System.setProperty("webdriver.edge.driver", "C://msedgedriver.exe");
		// dont create obj in static block you cant acess in local blcok
	}

	WebDriver driver = new EdgeDriver();

	public void LaunchAUT() {
		driver.manage().window().maximize();
		driver.navigate().to("https://login.salesforce.com/?locale=in");
		// driver.get("uRL");
		driver.manage().window().maximize();
	}

	public void clickOnForgetPasswordByid() {
		driver.findElement(By.id("forgot_password_link")).click();
	}

	public void clickOnForgetPasswordBytext() {
		driver.findElement(By.xpath("//a[text()='Forgot Your Password?']")).click();
	}

	public static void main(String[] args) {

		ClickForgetPasswordLink clickon = new ClickForgetPasswordLink();

		clickon.LaunchAUT();
		// clickon.clickOnForgetPasswordByid();
		clickon.clickOnForgetPasswordBytext();

	}

}
