package com.localSetup.ProjectTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportDemo {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		

		ExtentSparkReporter htmlReporter = new ExtentSparkReporter("extent.html");
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		ExtentTest test1 = extent.createTest("Google Search" , "Google Search Functionality");
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\Application\\workSpace\\AutomationProject\\driver\\chromedriver.exe");    
	     driver=new ChromeDriver();  
	    
	     test1.log(Status.INFO, "Starting test case");
	     
	     driver.get("htpps://google.com");
	     driver.findElement(By.name("q")).sendKeys("Automation");
	     test1.pass("Entered txt in textbox");
	     
	     driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
	     test1.pass("pressed keyboard enter key");
	     
	     Thread.sleep(4000);
	     driver.close();
	     driver.quit();
	     test1.pass("Closed the browser");
	     
	     test1.info("Test Completed");
	     
	     extent.flush();
	     
	    
	    

	}

}
