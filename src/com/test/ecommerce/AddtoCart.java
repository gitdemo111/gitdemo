package com.test.ecommerce;


import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.test.coreframework.BaseClass;

// Hard Assert - stopped the execution and marked the test case as failed - assert
// and SoftAssert - it wil not stop execution. - verify

public class AddtoCart extends BaseClass{
	
		
	@Test 
	public void addtocart_fromsearchresults()
	{
		System.out.println("inside addtocart_fromsearchresults");
		System.out.println("testing demo git");
		Assert.assertTrue(false);
		
	}
	
	
	@Test 
	public void addtocart_pricevalidation()
	{
	
		int exp = 90;
		int act = 95;
		
		SoftAssert s = new SoftAssert();
		
		driver.get("https://www.google.com");
		
		s.assertEquals(act, exp,"failed - price is not matched");
		
		System.out.println("inside addtocart_pricevalidation");
		
		s.assertAll();
		
	}
	

}
