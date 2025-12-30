package com.practice.jenkins.homepageTest;

import org.testng.annotations.Test;

public class HomePageTest {
	
	
	@Test
	public void loginTest() {
		
		System.out.println("================================");
		System.out.println("This is login test Test Case:");
		String browser = System.getProperty("browser");
		String url = System.getProperty("url");
		String userName = System.getProperty("userName");
		String password = System.getProperty("password");
		
		System.out.println("Browser Name : "+browser);
		System.out.println("WebSite Url : "+url);
		System.out.println("User Name : "+userName);
		System.out.println("Password : "+password);
		System.out.println("================================");
	}

}
