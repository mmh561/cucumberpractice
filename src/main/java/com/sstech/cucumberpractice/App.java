package com.sstech.cucumberpractice;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
	
	@Test
	public void TestLogInfunctionality() {
		
		ChromeDriver driver= new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MD Hasan\\Documents\\workspace-sts-3.9.7.RELEASE\\cucumberpractice");
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
	}
 
}
