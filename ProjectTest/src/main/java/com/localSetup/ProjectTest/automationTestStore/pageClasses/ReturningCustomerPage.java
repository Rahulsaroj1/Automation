package com.localSetup.ProjectTest.automationTestStore.pageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

//import com.localSetup.ProjectTest.automationTestStore.generic.Driver;
import com.localSetup.ProjectTest.automationTestStore.generic.Locators;

import com.localSetup.ProjectTest.automationTestStore.generic.*;

public class ReturningCustomerPage implements Locators {

//	public static void main(String[] args) {
//	
//	}
	
	public static void returningCustomerHeader(WebDriver driver) {
		 Driver.getter().loggerMethod("info","//<-----> Started returningCustomerHeader <-------->//");

		WebElement headerreturningCustomer= driver.findElement(By.xpath(we_headerreturningCustomer));
		
		Assert.assertTrue(headerreturningCustomer.isDisplayed(), "we_headerreturningCustomer is not displayed");
		Driver.getter().loggerMethod("info","we_headerreturningCustomer is  displayed");
		Assert.assertEquals(headerreturningCustomer.getText().trim(), "RETURNING CUSTOMER");
		
		Driver.getter().loggerMethod("info",headerreturningCustomer.getText().trim() +"is matched with expected->RETURNING CUSTOMER");
		
		
		 Driver.getter().loggerMethod("info","//<-----> End returningCustomerHeader<-------->//");
	}
	
	private static void loginNameField(WebDriver driver,String UName) {
		 
		 WebElement loginname=driver.findElement(By.cssSelector(we_loginname));
		 Assert.assertTrue(loginname.isDisplayed(), "we_loginname is not displayed");
		 Assert.assertTrue(loginname.isEnabled(), "we_loginname is not editable"); 
		 loginname.sendKeys(TestData.getter().getData("Movies", "AccountLoginPage", "InvalidUserName",0)); 
		 
		 Driver.getter().loggerMethod("info","loginNameField");
	}
	
	private static void passwordField(WebDriver driver, String PassWord) {
		 WebElement password=driver.findElement(By.cssSelector(we_password));
		 Assert.assertTrue(password.isDisplayed(), "we_password is not displayed");
		 Assert.assertTrue(password.isEnabled(), "we_password is not editable"); 
		 password.sendKeys("mohanlalyadav"); 
		 
		 Driver.getter().loggerMethod("info","passwordField");
	}
	
	private static void loginBTN(WebDriver driver) {
		 WebElement loginBTN=driver.findElement(By.cssSelector(we_loginBTN));
		 Assert.assertTrue(loginBTN.isDisplayed(), "we_loginBTN is not displayed");
		 Assert.assertTrue(loginBTN.isEnabled(), "we_loginBTN is not clickable"); 
		 loginBTN.click();
		 
		 Driver.getter().loggerMethod("info","loginBTN");
	}
	
	public static void loginWithUser(WebDriver driver) {
		//loginNameField(driver);
		//passwordField(driver);
		loginBTN(driver);
	}
	
	
	  
	    
	   
	    
	   
}
