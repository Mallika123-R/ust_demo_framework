package com.projectResources;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjects extends BaseClass {
	
	public PageObjects() {
		PageFactory.initElements(driver, this);
	}

	//Locator for the userName Login
	@FindBy(id = "login2")
	public WebElement Login_link;

	public WebElement getLogin_link() {
		return Login_link;
	}
	
	@FindBy(id = "loginusername")
	public WebElement userName;

	public WebElement getUserName() {
		return userName;
	}
	//Locator for the Password Login
	@FindBy(id = "loginpassword")
	public WebElement Password;

	public WebElement getPassword() {
		return Password;
	}

	//Locator for the  Submit Method

	@FindBy(xpath = "//button[text()='Log in']")
	public WebElement LoginButton;

	public WebElement getLoginButton() {
		return LoginButton;
	}
	
	
	@FindBy(xpath="//a[contains(text(),'Welcome')]")
	
	public WebElement User_lable;

	public WebElement getUserLable() {
		return User_lable;
	}
}
