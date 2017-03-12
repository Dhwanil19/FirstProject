package com.test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGMaven {

	ChromeDriver driver;
	public TestNGMaven() {
		// TODO Auto-generated constructor stub
	}
	
	@BeforeClass
	public void First()
	{
		
		 driver = new ChromeDriver();
	
	}
	
	@Test
	public void start()
	{
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
	}
	
}
