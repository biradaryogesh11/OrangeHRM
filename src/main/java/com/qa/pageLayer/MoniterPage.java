package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class MoniterPage extends TestBase
{
	public MoniterPage()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Monitors']")
	private WebElement moniter_tab;
	public void clickOnMoniterTab()
	{
		moniter_tab.click();
	}
	
	@FindBy(xpath="//a[text()='Apple monitor 24']")
	private WebElement apple_moniter_tab;
	public void clickOnApplelMoniter()
	{
		apple_moniter_tab.click();
	}

	@FindBy(xpath="//a[text()='ASUS Full HD']")
	private WebElement asus_moniter_tab;
	public void clickOnAsusMoniter()
	{
		asus_moniter_tab.click();
	}
}
