package com.infix.test;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverTest extends WebDriuverBase {

@Test
public void registration(){
	driver.findElement(By.id("email")).sendKeys("aktarchowdhury7@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("aa786786");
	driver.findElement(By.id("loginbutton")).click();
}
}