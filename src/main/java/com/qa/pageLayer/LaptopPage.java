package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class LaptopPage extends TestBase
{
	public LaptopPage()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Laptops']")
	private WebElement laptop_tab;
	public void clickOnlaptopTab()
	{
		laptop_tab.click();
	}
	
	@FindBy(xpath="//a[text()='Sony vaio i5']")
	private WebElement sony_vio_i5;
	public void clickOnSonyVio_i5()
	{
		sony_vio_i5.click();
	}
	
	@FindBy(xpath="//a[text()='Dell i7 8gb']")
	private WebElement dell_I7;
	public void clickOnDellI7()
	{
		dell_I7.click();
	}
	
	
	
	

}
