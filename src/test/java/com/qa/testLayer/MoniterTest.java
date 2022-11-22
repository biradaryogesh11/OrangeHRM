package com.qa.testLayer;

import org.testng.annotations.Test;

import com.qa.testBase.TestBase;

public class MoniterTest extends TestBase

{
	@Test
	public void buyMoniter()
	{
		moniter.clickOnMoniterTab();
		logger.info("cliked on apple tab");
		moniter.clickOnApplelMoniter();
		logger.info("clicked on apple moniter ");
		phonepage.clickOnAddToCartButton();
		logger.info(" apple moniter added to cart ");
	}
	@Test
	public void buyAsusMoniter()
	{
		moniter.clickOnMoniterTab();
		logger.info("cliked on apple tab");
		moniter.clickOnAsusMoniter();;
		logger.info("clicked on asus moniter ");
		phonepage.clickOnAddToCartButton();
		logger.info(" apple moniter added to cart ");
	}
	

}
