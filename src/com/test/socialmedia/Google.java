package com.test.socialmedia;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Google {
	
	
	
	@Parameters("url")
	@Test
	public void setup(String url) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver(); // Launching the chromebrowser
		
		driver.get(url);  // Launching the url
		
		driver.manage().window().maximize();
Thread.sleep(2000);
		
		driver.close();
	}

}
