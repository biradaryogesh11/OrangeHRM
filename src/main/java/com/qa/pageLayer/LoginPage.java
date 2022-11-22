package com.qa.pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;


public class LoginPage extends TestBase
{
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@id='login2']")
	private WebElement login_tab;
	public void clickOnLoginTab()
	{
		login_tab.click();
	}
	
	@FindBy(xpath="//input[@id='loginusername']")
	private WebElement login_id;
	public void enterLoginId(String user)
	{
        login_id.sendKeys(user);
	}

	@FindBy(xpath="//input[@id='loginpassword']")
	private WebElement password_id;
	public void enterpassword(String password)
	{
		password_id.sendKeys(password);
    }

	@FindBy(xpath="//button[normalize-space()='Log in']")
	private WebElement login_button1;
	public void clickOnLoginButton()
	{     
		login_button1.click();
    }

	@FindBy(xpath="//a[@id='nameofuser']")
	private WebElement expeceted_result;
	public String getUserName()
	{
		String exp = expeceted_result.getText();
		return exp;
	}




}
