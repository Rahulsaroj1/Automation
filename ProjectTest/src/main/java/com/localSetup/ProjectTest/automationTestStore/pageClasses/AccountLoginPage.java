package com.localSetup.ProjectTest.automationTestStore.pageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.localSetup.ProjectTest.automationTestStore.generic.Driver;
import com.localSetup.ProjectTest.automationTestStore.generic.Locators;

public class AccountLoginPage implements Locators{

	public static void main(String[] args) {
		

	}	
	
	public static void accountLoginHeader(WebDriver driver) {
		
		
		WebElement headerAccountLogin= driver.findElement(By.cssSelector(we_headerAccountLogin));
		Assert.assertTrue(headerAccountLogin.isDisplayed(), "we_headerAccountLogin is not displayed");
		Assert.assertEquals(headerAccountLogin.getText().trim(), "ACCOUNT LOGIN");	
		
		 Driver.getter().loggerMethod("info", "accountLoginHeader");
	}
}
