package com.localSetup.ProjectTest.automationTestStore.testClasses;

//import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.localSetup.ProjectTest.automationTestStore.generic.Driver;
import com.localSetup.ProjectTest.automationTestStore.generic.TestData;
import com.localSetup.ProjectTest.automationTestStore.pageClasses.AccountLoginPage;
import com.localSetup.ProjectTest.automationTestStore.pageClasses.ReturningCustomerPage;
import com.localSetup.ProjectTest.automationTestStore.pageClasses.TopHeaderMenuPage;

@Listeners(com.localSetup.ProjectTest.automationTestStore.listenerTestNG.TestListener.class)	
public class TC001_Validate_Valid_Login {
		
	
	@BeforeClass
	public void  testConfigurator() {
		Driver.getter().loggerConfigurator(this);
	}
	
	@Test
	public static void verifyLoginFunction() throws Exception {
	    
		 Driver.getter().loggerMethod("info","verify Login Function");
		 WebDriver driver= Driver.getter().launchBrowser("chrome", "https://automationteststore.com/");

	    TopHeaderMenuPage.loginOrRegister(driver);
	    AccountLoginPage.accountLoginHeader(driver);
	    ReturningCustomerPage.returningCustomerHeader(driver);
	    ReturningCustomerPage.loginWithUser(driver);
	    
	       
	    driver.close();
	    
	    //driver.quit();
	   
	}
	
}
