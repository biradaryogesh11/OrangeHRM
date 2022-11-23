package com.qa.testLayer;

import org.testng.annotations.Test;

import com.qa.testBase.TestBase;

public class LaptopTest extends TestBase
{
	@Test(groups= {"sanity"})
	public void buyLaptop()
	{
		laptop.clickOnlaptopTab();
		logger.info("clicked on tab");
		laptop.clickOnSonyVio_i5();
		logger.info("clicked on sony i5");
		phonepage.clickOnAddToCartButton();
		logger.info("laptop is added to cart");
		
	}

	@Test(groups= {"Regression","sanity"})
	public void buyDellLaptop()
	{
		laptop.clickOnlaptopTab();
		logger.info("clicked on tab");
		laptop.clickOnDellI7();;
		logger.info("clicked on Dell I7");
		phonepage.clickOnAddToCartButton();
		logger.info("laptop is added to cart");
		
	}
	

}
