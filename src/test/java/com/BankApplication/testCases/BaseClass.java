package com.BankApplication.testCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.BankApplication.utilities.ReadConfig;


public class BaseClass {
	
	ReadConfig readconfig = new ReadConfig();
	public  String BaseURL = readconfig.getApplicationURL();
	public  String Username = readconfig.getUsername();
	public  String Password = readconfig.getPassword();
	public static WebDriver driver;
	public static ChromeOptions Options;
	public static Logger logger;
	
	@BeforeClass
	public void setup() {
		
		logger= Logger.getLogger("BankingApplication");
		PropertyConfigurator.configure("log4j.properties");
		System.setProperty("webdriver.chrome.driver",readconfig.getchromepath());
		Options =  new ChromeOptions();
		Options.addArguments("--remote-allow-origins=*");
	     driver = new ChromeDriver(Options);
	    	
	}
	@AfterClass
	public void teardown() {
		driver.quit();
	}

}
