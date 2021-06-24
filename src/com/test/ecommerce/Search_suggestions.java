package com.test.ecommerce;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Search_suggestions {
	
	
	@BeforeClass
	public void beforeclassmethod()
	{
		System.out.println("inside beforeclassmethod - before class");
	}
	
	
	@AfterClass
	public void afterclassmethod()
	{
		System.out.println("inside afterclassmethod - after class");
	}
	
	
	@BeforeMethod
	public void dataretrieval()
	{
		System.out.println("inside dataretrieval - before method");
	}
	
	@AfterMethod
	public void dataretrieval_cleanup()
	{
		System.out.println("inside dataretrieval_cleanup - after method");
	}
	
	
	@Test
	public void verifysearchsuggestions()
	{
		System.out.println("inside verifysearchsuggestions - actual testcase");
	}
	
	
	@Test
	public void Search_bysearchsuggestions()
	{
		System.out.println("inside Search_bysearchsuggestions - actual testcase");
	}
	
	
	@Test
	public void Search_suggestions_selection()
	{
		System.out.println("inside Search_suggestions_selection - actual testcase");
	}

}
