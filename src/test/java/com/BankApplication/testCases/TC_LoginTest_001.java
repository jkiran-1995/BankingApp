package com.BankApplication.testCases;

import org.testng.annotations.Test;

import com.BankAppilcation.testObject.LoginPage;

public class TC_LoginTest_001 extends BaseClass {
	
	@Test
	public void loginTest() {
		
		 driver.get(BaseURL);
		 logger.info("URL is Opened");
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(Username);
		logger.info("Username is entered");
		lp.setPassword(Password);
		logger.info("Password is entered");
		lp.clicksubmit();
		logger.info("Credentials are submitted");
	}

}
