package com.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginByid {

		static {
			//Dipak
					System.setProperty("webdriver.edge.driver", "C://msedgedriver.exe");
					// dont create obj in static block you cant acess in local blcok

				}
				
		WebDriver driver=new EdgeDriver();
	
	public void LaunchAUT()
	{
		
	}
	
	
	public static void main(String[] args) {
	
		
		
		
	}

}
