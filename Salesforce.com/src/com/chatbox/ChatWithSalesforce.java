package com.chatbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ChatWithSalesforce {

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

	public void chatBox() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"sf-chat\"]/div[2]/div/button")).click();
	}

	public void sendMessage() throws InterruptedException {

		Thread.sleep(5000);
		// driver.findElement(By.xpath("//*[@id=\"sf-chat\"]/div[3]/div/div/div[2]/div/div/div[1]/ul/li[3]/div[2]/div/ul/li[1]/button")).click();
		Thread.sleep(5000);

	}

	public static void main(String[] args) throws InterruptedException {

		ChatWithSalesforce click = new ChatWithSalesforce();
		click.LaunchAUT();
		click.chatBox();
		click.sendMessage();

	}

}
