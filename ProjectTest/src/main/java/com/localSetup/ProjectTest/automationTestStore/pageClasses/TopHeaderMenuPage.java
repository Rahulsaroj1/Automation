package com.localSetup.ProjectTest.automationTestStore.pageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.localSetup.ProjectTest.automationTestStore.generic.Driver;
import com.localSetup.ProjectTest.automationTestStore.generic.Locators;

public class TopHeaderMenuPage implements Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	public static void loginOrRegister(WebDriver driver) {
		 
		WebElement loginOrRegister= driver.findElement(By.cssSelector(we_css_loginOrRegister));
		 Assert.assertTrue(loginOrRegister.isDisplayed(), "we_loginOrRegister is not displayed");
		 loginOrRegister.click();
		 
		// Driver.getter().loggerMethod("//<-----> Start loginOrRegister Method"+loginOrRegister+"<-------->//");
		 Driver.getter().loggerMethod("info", "loginOrRegister");
		// Driver.getter().loggerMethod("//<-----> End loginOrRegister method sucessfully <-------->//");
	}

}
