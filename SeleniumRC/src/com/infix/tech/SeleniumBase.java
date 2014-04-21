package com.infix.tech;

import org.junit.After;
import org.junit.Before;

import com.thoughtworks.selenium.DefaultSelenium;

public class SeleniumBase {
	DefaultSelenium selenium=new DefaultSelenium("localhost", 4444, "*firefox", "http://www.facebook.com");
	@Before
public void BrowserOpen(){
		selenium.start();
		selenium.open("/");
		selenium.windowMaximize();
		selenium.setSpeed("4000");
	
}
	@After
	public void BrowserClose(){
		selenium.close();
		selenium.stop();
	}
}
