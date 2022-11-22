package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class PhonePage extends TestBase
{
	public PhonePage()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[contains(text(),'Phones')]")
	private WebElement phone_tab;
	public void clickOnPhoneTab()
	{
		phone_tab.click();
	}
	@FindBy(xpath="//a[text()='Samsung galaxy s6']")
	private WebElement samsung_phone;
	public void clickOnPhone()
	{
		samsung_phone.click();
	}
	@FindBy(xpath="//a[text()='Add to cart']")
	private WebElement add_to_cart_button;
	public void clickOnAddToCartButton()
	{
		add_to_cart_button.click();
	}
	
	@FindBy(xpath="//a[text()='Nexus 6']")
	private WebElement Nexus_phone;
	public void clickOnNexusPhone()
	{
		Nexus_phone.click();
	}
	

}
