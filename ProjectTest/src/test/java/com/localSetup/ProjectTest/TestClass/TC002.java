package com.localSetup.ProjectTest.TestClass;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.localSetup.ProjectTest.automationTestStore.generic.Driver;
import com.localSetup.ProjectTest.automationTestStore.pageClasses.AccountLoginPage;
import com.localSetup.ProjectTest.automationTestStore.pageClasses.ReturningCustomerPage;
import com.localSetup.ProjectTest.automationTestStore.pageClasses.TopHeaderMenuPage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TC002 {
	
	static ExtentTest test;
	static ExtentReports report;	
	
	@BeforeClass
	public static void startTest()
	{
	report = new ExtentReports("ExtentReportDriver.html");
	test = report .startTest("Extent_Report_Login");
	}
	
		
	@Test
	public static void verifyLoginFunction() throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Application\\workSpace\\AutomationProject\\driver\\chromedriver.exe");    
//	    WebDriver driver=new ChromeDriver();  
//	    driver.get("https://automationteststore.com/");
//	    driver.manage().window().maximize();
//	    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	    
		
	  WebDriver driver= Driver.getter().launchBrowser("chrome", "https://automationteststore.com/");
	  Driver.getter().loggerMethod("Tc 001 logger for low level report","Report of Login");
	    //POM(Page Object Model)
	    TopHeaderMenuPage.loginOrRegister(driver);
	    AccountLoginPage.accountLoginHeader(driver);
	    ReturningCustomerPage.returningCustomerHeader(driver);
	    ReturningCustomerPage.loginWithUser(driver);
	    
	    test.log(LogStatus.PASS, "Successfull implemented all login methods");	   
	    driver.close();	    
	}
	@Test
	public void failCase() {
		 try {
	            int a = 30, b = 0;
	            int c = a/b; 
	            System.out.println ("Result = " + c);
	        }
	        catch(ArithmeticException e) {
	            System.out.println ("Can't divide a number by 0");
	            test.log(LogStatus.FAIL, "ArithmeticException - Can not divide a number by 0");	 
	        	} 
	}
	
	
	@AfterClass
	public static void endTest() {
				
		report.endTest(test);
		report.flush();
	}

}
