package com.test.ReusableLibrary;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.test.coreframework.BaseClass;

public class CommonMethods extends BaseClass{
	
	
	public static void launchurl(String url)
	{
		
		driver.get(url);
			
	}
	
	
	public static void takescreenshot(String name) throws IOException
	{
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src,new File(System.getProperty("user.dir")+"//Screenshots/"+name+".png"));
	}
	

}
