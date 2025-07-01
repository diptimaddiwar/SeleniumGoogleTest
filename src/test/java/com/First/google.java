package com.First;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class google {

	WebDriver driver;
	@Test
	public void launchApp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
	}
}
