package com.login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class ClickLinkText {
	static {
		// Dipak
		System.setProperty("webdriver.edge.driver", "C://msedgedriver.exe");
		// dont create obj in static block you cant acess in local blcok
	}

	WebDriver driver = new EdgeDriver();

	public void clickLink() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		driver.get("http://facebook.com");
		driver.findElement(By.linkText("Create new account")).click();

		driver.findElement(By.name("firstname")).sendKeys("Dipak");
		driver.findElement(By.name("lastname")).sendKeys("Kadam");
		driver.findElement(By.name("reg_email__")).sendKeys("7057807659");
		// driver.findElement(By.xpath("//input[@type='password']")).sendKeys("dipakfla");

		driver.findElement(By.xpath("//label[text()='Male']")).click();

		WebElement dayelement = driver.findElement(By.id("day"));

		Select daylistbox = new Select(dayelement);
		daylistbox.selectByIndex(19);
		Thread.sleep(2000);
		Select monthlistbox = new Select(driver.findElement(By.id("month")));
		monthlistbox.selectByVisibleText("April");
		Thread.sleep(2000);
		Select yearlistbox = new Select(driver.findElement(By.id("year")));
		yearlistbox.selectByValue("1996");
	}

	public static void main(String args[]) throws InterruptedException {
		ClickLinkText obj = new ClickLinkText();
		obj.clickLink();
	}
}