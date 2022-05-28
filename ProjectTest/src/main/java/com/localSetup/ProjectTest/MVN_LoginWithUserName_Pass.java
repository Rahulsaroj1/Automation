package com.localSetup.ProjectTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MVN_LoginWithUserName_Pass {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Application\\PracticeProject\\driver\\chromedriver.exe");     
	    WebDriver driver=new ChromeDriver();  
	    driver.get("https://automationteststore.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	    
	  
	    driver.findElement(By.cssSelector("ul[id='customer_menu_top'] a")).click();
	    
	    driver.findElement(By.cssSelector("input[id='loginFrm_loginname']")).sendKeys("mohanlalyadav"); 
	    
	    driver.findElement(By.cssSelector("input[id='loginFrm_password']")).sendKeys("mohanlalyadav"); 
	    
	    driver.findElement(By.cssSelector("button[title='Login']")).click();
	   // driver.close();
	  
	    
	    

	}

}
