package com.aktar.web;

import org.junit.Test;
import org.openqa.selenium.By;

public class Test3 extends OpeningClass {
	@Test
	public void ConnectFaceBook(){
		driver.get("https://www.facebook.com/starbucks/");
		driver.findElement(By.id("email")).sendKeys("aktarchowdhury7@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("aa786786");
		driver.findElement(By.id("u_0_0")).submit();
		
		
	}

}
