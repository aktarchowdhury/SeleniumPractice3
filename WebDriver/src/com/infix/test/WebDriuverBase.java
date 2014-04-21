package com.infix.test;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriuverBase {
	WebDriver driver=new FirefoxDriver();
	@Before
public void BrowserStart(){
	driver.get("http://www.facebook.com");
	
}
}
