package com.test.coreframework;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.test.dataUtilities.Readfromproperty;

public class BaseClass extends Readfromproperty {

	
	public static WebDriver driver=null;
	
	
	@BeforeSuite
	public void driversetup()
	{		
		
		String value = prop.getProperty("browser");
		
		System.out.println("value from proerty file is "+value);
		
		if (value.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
			driver =  new ChromeDriver(); // Launching the chromebrowser
		}
		
		else if (value.equalsIgnoreCase("firefox"))
		{
			// setting path
			driver =  new FirefoxDriver(); 
			
		}
		
		else if (value.equalsIgnoreCase("ie"))
		{
			//IE path
			driver = new InternetExplorerDriver();
		}
		
		
		driver.manage().window().maximize();
		
		
	}
	
	
	@AfterSuite
	public void closedriver()
	{
		
		driver.close();
		
	}


	public static void takescreenshot(String name) throws IOException
	{
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src,new File(System.getProperty("user.dir")+"//Screenshots/"+name+".png"));
	}
	
	
	
	
}
