package com.qa.testLayer;

import org.testng.annotations.Test;

import com.qa.testBase.TestBase;

public class PhoneTest extends TestBase {
	@Test(groups = { "sanity", "Regression" })
	public void buyPhone() {
		phonepage.clickOnPhoneTab();
		logger.info("Clicked on phone tab");
		phonepage.clickOnPhone();
		logger.info("Clicked on samsung mobile");
		phonepage.clickOnAddToCartButton();
		logger.info("added to cart");

	}

	@Test(groups = { "sanity" })
	public void buyNexusPhone() {
		phonepage.clickOnPhoneTab();
		logger.info("Clicked on phone tab");
		phonepage.clickOnNexusPhone();
		logger.info("Clicked on samsung mobile");
		phonepage.clickOnAddToCartButton();
		logger.info("added to cart");

	}

}
