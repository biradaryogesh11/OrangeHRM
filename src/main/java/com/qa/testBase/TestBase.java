package com.qa.testBase;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.qa.pageLayer.LaptopPage;
import com.qa.pageLayer.LoginPage;
import com.qa.pageLayer.MoniterPage;
import com.qa.pageLayer.PhonePage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase 
{
	public static WebDriver driver;
	public static Logger logger;
	public static LoginPage loginpage;
	public static PhonePage phonepage;
	public static LaptopPage laptop;
	public static MoniterPage moniter;
	
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
    public void setProperty(String br) throws InterruptedException
	{
		if(br.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			 driver= new ChromeDriver();
		}
		else if(br.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
		}
		else if(br.equalsIgnoreCase("edge"))
		{
			WebDriverManager.chromedriver().setup();
			driver= new EdgeDriver();
		}
		else
		{
			System.out.println("Please Enter Correct Url");
		}
		driver.get("https://demoblaze.com/index.html");
		logger.info("Url is entered");
		driver.manage().window().maximize();
 		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		Thread.sleep(2000);
		loginpage=new LoginPage();
   	     loginpage.clickOnLoginTab();
   	     Thread.sleep(2000);
		 loginpage.enterLoginId("Yogesh11");
		 Thread.sleep(2000);
		 logger.info("user id is entered");
		 loginpage.enterpassword("yogesh123");
		 logger.info("password is entered");
		 Thread.sleep(2000);
		// driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
		 loginpage.clickOnLoginButton();
		 logger.info("Click on login button");
		 Thread.sleep(5000);
		 String Expected = driver.findElement(By.xpath("//a[@id='nameofuser']")).getText();
		 Thread.sleep(5000);
		 String required = loginpage.getUserName();
		 Assert.assertEquals(required, Expected);
		
		 
		 phonepage= new PhonePage();
		 laptop=new LaptopPage();
		  moniter=new MoniterPage();
	}
	
	@AfterMethod
	public void closeeTab() throws InterruptedException
	{
	    Thread.sleep(20000);	
		driver.quit();
	}

}
