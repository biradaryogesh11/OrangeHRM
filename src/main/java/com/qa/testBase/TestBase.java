package com.qa.testBase;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase 
{
	public static WebDriver driver;
	public static Logger logger;
	
	@BeforeClass
	public void start()
	{
		 logger=Logger.getLogger("OrangeHRM");
		 PropertyConfigurator.configure("log4j.properties");
		 logger.info("==============Executaion Started===========");
	}
	@AfterClass
	public void finish()
	{
		 logger.info("==============Executaion finished===========");
	}
	@Parameters("browser")
	@BeforeMethod
	public void setProperty(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			 driver= new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			WebDriverManager.chromedriver().setup();
			driver= new EdgeDriver();
		}
		else
		{
			System.out.println("Please Enter Correct Url");
		}
	}
	
	@AfterMethod
	public void closeeTab()
	{
		
		driver.quit();
	}

}
