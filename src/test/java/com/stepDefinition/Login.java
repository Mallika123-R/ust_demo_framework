package com.stepDefinition;


import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestContext;
import org.testng.SkipException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.projectResources.BaseClass;
import com.projectResources.FileReadManager;

import Extent_manager.extent_report;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Login extends BaseClass{
   
	public WebDriver driver;
     
	@Given("User launching the browser and Enter the URL")
	public void user_launching_the_browser_and_enter_the_url() {
		driver=launchBrowser(BaseClass.readProperty("Browser"));
		driver.get(BaseClass.readProperty("URL"));
	    
	}
	
	
	@Given("User Enter the Valid UserName and Passowrd")
	public void user_enter_the_valid_user_name_and_passowrd() throws InterruptedException {
	
		WebElement getLogin=FileReadManager.getInstance().Locators().Login_link;
		click(getLogin);
		
		WebElement name=FileReadManager.getInstance().Locators().userName;
		type(name,"UserName");
		
		WebElement Enterpassword=FileReadManager.getInstance().Locators().Password;
		type(Enterpassword,"password");
		
		WebElement login=FileReadManager.getInstance().Locators().LoginButton;
		//ExpectedConditions.visibilityOf(login);
		click(login);

	}
 
	@Then("User Validating the Login")
	public void user_validating_the_login() throws InterruptedException {
		
		WebElement lable=FileReadManager.getInstance().Locators().User_lable;
		ExpectedConditions.visibilityOf(lable);
		verifyLogin_Labal("login_verify",lable);
		
	}
	

	@Given("User Enter Invalid UserName and Passowrd")
	public void user_enter_invalid_user_name_and_passowrd() throws InterruptedException, IOException {
	
		WebElement getLogin=FileReadManager.getInstance().Locators().Login_link;
		click(getLogin);
	
		WebElement name=FileReadManager.getInstance().Locators().userName;
		type(name,"Invalid_userName");
		
		WebElement Enterpassword=FileReadManager.getInstance().Locators().Password;
		type(Enterpassword,"Invalid_Password");
		
		WebElement login=FileReadManager.getInstance().Locators().LoginButton;
		ExpectedConditions.visibilityOf(login);
		click(login);
		String value=BaseClass.ReadExcel(1,1);
		System.out.println("---Read Excel Value------"+value);
		
	
		//driver.switchTo().alert().accept();
		
	}
	

 	
	      
	@After
	public void teardown(Scenario scenario)
	{
	   System.out.println(scenario.getName());
		driver.quit();
	}
	
}
