package com.aktar.web;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebBase {
WebDriver driver=new FirefoxDriver();
@Before
public void BrowserOpen(){
	driver.get("http://www.facebook.com");
}
}