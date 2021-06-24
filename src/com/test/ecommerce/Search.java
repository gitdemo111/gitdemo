package com.test.ecommerce;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Search {
	
	
	//@BeforeSuite
	public void driversetup()
	{
		
	System.out.println("demo ");	
	System.out.println("inside driversetup - should execute first before the testcases");
	}
	
	//@AfterSuite
	public void closedriver()
	{
		
	System.out.println("inside closedriver - should execute last after the testcases");
	}

	
	
	//@BeforeTest
	
	//@Parameters("url")
	@Test
	public void launchrul()
	{
		System.out.println("inside launchrul - using before test annotation ");
	
	}
	
	
	@AfterTest 
	public void closingconnection()
	{
		System.out.println("inside closingconnection - using after test annotation");
	
	}
	
	@Test (priority = 1)
	public void verifysearchbox()
	{
		System.out.println("inside verifysearchbox");
	}
	
	
	@Test (priority = 2)
	public void search_byinput()
	{
		System.out.println("search_byinput");
	}
	
	
	@Test (priority = 5, enabled =false)
	public void search_byquicklinks()
	{
		System.out.println("search_byquicklinks");
	}
	
	
	@Test (priority = 4)
	public void search_bycategory()
	{
		System.out.println("search_byquicklinks");
	}
	
	
	@Test (priority = 3, groups = {"smoke"})
	public void browse_bycategory()
	{
		System.out.println("browse_bycategory");
	}
	
	
	@Test (priority = 6)
	public void closebrowser()
	{
		System.out.println("inside closebrowser");
	
	}
	

}
