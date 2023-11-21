package com.eBankinSite.testdata;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.eBankingSite.pageobject.LoginPage;




@Test
public class TC_LoginTest_001 extends BaseClass {
	
	public void loginTest()
	{
		
		logger.info("Url is opened");
		LoginPage lp=new LoginPage(driver);
		lp.setUsername(username);
		logger.info("User name is entered");
		lp.setPassword(password);
		logger.info("Password is Entered");
		lp.clickSubmit();
		logger.info("Button is clicked");
	
		if(driver.getTitle().equals("GTPL Bank Manager HomePage")) {
			Assert.assertTrue(true);
		}else {
			Assert.assertTrue(false);
		}
	} 
}
