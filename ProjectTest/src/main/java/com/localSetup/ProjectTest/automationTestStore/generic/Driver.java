package com.localSetup.ProjectTest.automationTestStore.generic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.apache.log4j.BasicConfigurator;  
import org.apache.log4j.LogManager;  
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator; 

public class Driver  {
	static WebDriver driver=null;
	private static Driver className=null;
	static 	 Logger logger =null;
	public static void main(String[] args) throws Exception {
	//	String chrome="chrome";
	 //   String URL="https://automationteststore.com/";
	    

	}
//	public Driver(String browserName, String URL) throws Exception{
//		
//		launchBrowser(browserName, URL);	
//		
//	}
	private static Driver setter() {
	if(className==null) {
		className=  new Driver();
		System.out.println("new class object created");
	}else {
		className=className;
		System.out.println("Used already created obj");
	}
	return className;
	}
	
	
	public static Driver getter() {
		return setter();
	//	WebDriver driverObj=driver;
	//	return driverObj;
	}	
	
	
	public  WebDriver launchBrowser(String browser, String URL) throws Exception{
		 Driver.getter().loggerMethod("info","//<-----> Started launchBrowser method to lauch "+browser+"<-------->//");
		if(browser.equalsIgnoreCase("chrome")){
		
			System.setProperty("webdriver.chrome.driver",
					"D:\\Application\\workSpace\\AutomationProject\\driver\\chromedriver.exe");    
			 driver=new ChromeDriver();  	
			 Driver.getter().loggerMethod("info","Lauch Chrome Browser");
		}
		else if(browser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.chrome.driver",
					"gekoDriver"); 
			 driver = new FirefoxDriver();	 
			 Driver.getter().loggerMethod("info", "Lauch Firefox Browser");
		}
		else if(browser.equalsIgnoreCase("Edge")){
			System.setProperty("webdriver.chrome.driver",
					"D:\\Application\\workSpace\\AutomationProject\\driver\\chromedriver.exe"); 
			 driver = new EdgeDriver(); 
			 Driver.getter().loggerMethod("info","Lauch Edge Browser");
		}
		else{		
			System.out.println("Incorrect Browser");
			 Driver.getter().loggerMethod("error","Wrong Browser Type pass "+browser);
		}
		driver.get(URL);
		driver.manage().window().maximize();	   
	    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		 Driver.getter().loggerMethod("info","//<-----> End launchBrowser method sucessfully <-------->//");
		return driver;
	}
	
	
	public static By locatorType(By by, String locator) {
	//we_css_loginOrRegister
		//By by = null;
		String type=locator.split("_")[1];
		if(type.equalsIgnoreCase("css")) {
			by.cssSelector(locator);
			
		}else if(type.equalsIgnoreCase("xpath")) {
			by.xpath(locator);
		}else
			System.out.println("Invalid loctor formate exception");
		
		return by;
		
	}
	
	// private static final Logger logger = LogManager.getLogger(Driver.class); 
	 public  void loggerMethod() {
		    PropertyConfigurator.configure("D:\\Application\\workSpace\\ProjectTest\\Property\\logging.log"); 
	//	 Logger logger = LogManager.getLogger(this.getClass());  
	  // basic log4j configurator  
	  BasicConfigurator.configure();  
	  logger.info("Test Logger");  
	  
	   
	 } 
	 
	 public  void loggerConfigurator(Object obj) {  
		  logger = LogManager.getLogger(obj.getClass());  
		  PropertyConfigurator.configure("D:\\Application\\workSpace\\ProjectTest\\Property\\logging.log"); 
	  // basic log4j configurator  
		  BasicConfigurator.configure(); 
	 }
	 
	 public  void loggerMethod(String type, String message) {
		 if(type.equalsIgnoreCase("info")) {
	  logger.info(message);  
		 }else if(type.equalsIgnoreCase("error")) {
			 
		 }
	  else if(type.equalsIgnoreCase("debug")) {
		  
	  }else if(type.equalsIgnoreCase("fatal")) {
		  
	  }else {
		  
	  }
	
	 }}
