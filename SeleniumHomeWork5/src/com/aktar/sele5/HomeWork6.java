package com.aktar.sele5;

import org.junit.Test;
import org.openqa.selenium.By;

public class HomeWork6 extends HomeWork5 {
@Test
public void RegistraTion(){
 driver.findElements(By.id("u_0_1")).sensendKeys("Aktar");
 driver.findElements(By.id("u_0_3")).sendKeys("chowdhury");
 driver.findElements(By.id("u_0_5")).sendKeys("aktarchowdhury7@gmail.com");
 driver.findElements(By.id("u_0_8")).sendKeys("aktarchowdhury7@gmail.com");
 driver.findElements(By.id("u_0_a")).sendKeys("a7867867");
 
}
}
