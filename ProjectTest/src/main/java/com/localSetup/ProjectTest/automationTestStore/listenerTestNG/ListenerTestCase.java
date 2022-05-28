package com.localSetup.ProjectTest.automationTestStore.listenerTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;


public class ListenerTestCase {


	@Test
	public void loginUser() {
		System.out.println("Login Passed");
		Assert.assertEquals("Mohan", "Mohan");

	}

	@Test
	public void logoutUser() {
		System.out.println("Logout Failed");
		Assert.assertEquals("Mohan", "Sohan", "Invalid User Name");
	}
	
	@Test
	public void logoutAgain() {
		System.out.println("Logout Success");
		Assert.assertNotNull("Selenium", null);
		
	}

}
