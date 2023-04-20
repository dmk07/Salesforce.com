package com.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class TS_CreateSalsforceAccount {

	static {
		// Dipak
		System.setProperty("webdriver.edge.driver", "C://msedgedriver.exe");
		// dont create obj in static block you cant acess in local blcok
	}

	WebDriver driver = new EdgeDriver();

	public void LaunchAUT() {
		driver.manage().window().maximize();
		driver.navigate().to("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=jumbo1-btn-ft");
		// driver.get("uRL");
		driver.manage().window().maximize();
	}

	public void registerUser() {
		driver.findElement(By.xpath("//input[@name='UserFirstName']")).sendKeys("Dipak");
		driver.findElement(By.xpath("//input[@name='UserLastName']")).sendKeys("Kadam");
		driver.findElement(By.xpath("//input[@name='UserEmail']")).sendKeys("dipak100kadam@gmail.com");

		WebElement jobtitle = driver.findElement(By.xpath("//select[@name='UserTitle']"));

		Select selectjob = new Select(jobtitle);
		selectjob.selectByVisibleText("Sales Manager");

		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("Square");

		WebElement selectEmp = driver.findElement(By.xpath("//select[@name='CompanyEmployees']"));

		Select selectemp = new Select(selectEmp);
		selectemp.selectByVisibleText("16 - 50 employees");

		driver.findElement(By.xpath("//input[@name='UserPhone']")).sendKeys("7070587548");

		WebElement selectcountry = driver.findElement(By.xpath("//select[@name='CompanyCountry']"));

		Select selectcon = new Select(selectcountry);
		selectcon.selectByVisibleText("India");
		driver.findElement(By.xpath("//div[@class='checkbox-ui']")).click();

		driver.findElement(By.xpath("//button[@name='start my free trial']")).click();

	}

	public static void main(String[] args) {

		TS_CreateSalsforceAccount obj = new TS_CreateSalsforceAccount();
		obj.LaunchAUT();
		obj.registerUser();

	}

}
