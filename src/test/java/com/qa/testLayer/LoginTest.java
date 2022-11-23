package com.qa.testLayer;

import org.openqa.selenium.By;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.testBase.TestBase;
import com.qa.utility.ExcelHandling;

public class LoginTest extends TestBase
{
    @Test(dataProvider="excel",dataProviderClass=ExcelHandling.class)
	public void loginToOrangeHrm() throws InterruptedException
	{    Thread.sleep(2000);
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
	}
}
