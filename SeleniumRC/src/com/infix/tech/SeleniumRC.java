package com.infix.tech;

import org.junit.Before;
import org.junit.Test;

import com.thoughtworks.selenium.DefaultSelenium;

public class SeleniumRC extends SeleniumBase{
	
	@Test
	public void LogIn(){
		selenium.type("email", "aktarchowdhury7@gmail.com");
		selenium.type("pass", "aa786786");
		selenium.click("u_0_n");
	}
}
