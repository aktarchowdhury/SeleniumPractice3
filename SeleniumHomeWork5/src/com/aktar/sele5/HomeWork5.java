package com.aktar.sele5;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomeWork5 {
WebDriver driver=new FirefoxDriver();
@Before
public void OpenBrowser(){
	driver.get("https://www.facebook.com/");
}
@After
public void TestDone(){
	driver.quit();
}
}
