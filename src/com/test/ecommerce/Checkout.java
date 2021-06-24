package com.test.ecommerce;

import org.testng.annotations.Test;

public class Checkout {
	
	
	@Test
	public void checkout_shippingaddress()
	{
		System.out.println("inside checkout_shippingaddress");
	}
	
	
	@Test (groups = {"smoke","reg"})
	public void checkout_payment()
	{
		System.out.println("inside checkout_shippingaddress");
	}
	
	@Test (groups = {"smoke"})
	public void reviewprice()
	{
		System.out.println("inside reviewprice");
	}

}
