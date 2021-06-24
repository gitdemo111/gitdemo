package com.test.socialmedia;

import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.test.ReusableLibrary.CommonMethods;
import com.test.coreframework.BaseClass;
import com.test.dataUtilities.ReadfromExcel;
import com.test.locators.Getlocators;

public class Facebook extends BaseClass{
	
	CommonMethods c =  new CommonMethods();
	


	//@Parameters("url")
	@Test
	public void openapplication() throws InterruptedException, FileNotFoundException
	{
		String url=ReadfromExcel.readexceldata("TC01_OAPP", "url");
		c.launchurl(url);	
		
	}	
	
	
	
	@Test
	public void ValidateUserName() throws FileNotFoundException, InterruptedException
	{
		
		String url=ReadfromExcel.readexceldata("TC01_OAPP", "url");
		
		c.launchurl(url);
		
		String usernameval=ReadfromExcel.readexceldata("TC01_OAPP", "username");
		
		driver.findElement(By.id(Getlocators.username)).sendKeys(usernameval);
		
		Thread.sleep(2000);
	}

}
