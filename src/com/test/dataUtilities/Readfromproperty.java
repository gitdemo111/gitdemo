package com.test.dataUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Readfromproperty {
	
	
	protected Properties prop = new Properties();
	
	@BeforeSuite
	public void readdata() throws IOException
	{		
		
		FileInputStream fi = new FileInputStream("D:\\Mathimist\\Selenium_Projects\\TestNG_learning\\testdata.properties");
		
		prop.load(fi);
		
		System.out.println(prop.getProperty("envrionment"));
		
		System.out.println(prop.getProperty("url1"));
		
		System.out.println(prop.getProperty("url2"));
		
		System.out.println(prop.getProperty("url3"));
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
		
		
		prop.setProperty("envrionment", "stage");
		
		System.out.println(prop.getProperty("envrionment"));
		
		FileOutputStream fo = new FileOutputStream("D:\\Mathimist\\Selenium_Projects\\TestNG_learning\\testdata.properties");
		
		prop.store(fo, "envrionment updated");
		
		
	}

}
