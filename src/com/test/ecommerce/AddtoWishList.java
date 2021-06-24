package com.test.ecommerce;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AddtoWishList{
	
	
	//@Parameters({"url","username","password"})
	
	@Test (dataProvider="login") 
	public void login(String usrname, String pwd) throws InterruptedException
	{
		//Thread.sleep(3000);
		
		//driver.get("www.google.com");
		
		
		System.out.println("inside login");
		//System.out.println("value from the parameter url is "+urlvalue);
		
		System.out.println("username is "+usrname);
		System.out.println("password is "+pwd);
	}
	
	
	@Test
	public void lockuser()
	{
		
		System.out.println("inside lockuser");
	}
	
	@Test (dataProvider="addlist")
	public void list_additems(String name, String pname)
	{
		System.out.println("inside list_additems");
		System.out.println("list name "+name);
		System.out.println("product name "+pname);
	}
	
	
	@Test 
	public void list_removeitems()
	{
		System.out.println("inside list_removeitems");
	}
	
	
	
	@DataProvider (name="login")
	public Object[][] logindata()
	{
		Object[][] data = new Object[3][2];
		
		// first data set
		data[0][0] = "username1";
		data[0][1] = "pwd1";
		
		// sencond data set
		data[1][0] = "username12";
		data[1][1] = "pwd12";
		
		
		data[2][0] = "username13";
		data[2][1] = "pwd13";
				
				
		return data;
		
	}
	
	@DataProvider (name="addlist")
	public Object[][] listdata()
	{
		return new Object[][] {
			
			{"list1","product1"},
			{"list1","product2"},
			{"list2","product3"},
			{"list1","product4"},
			{"list1","product5"},
			{"list2","product6"},
			{"list1","product7"},
			{"list1","product8"},
			{"list2","product9"}
					
			
		};
		
		
		
	}

}
