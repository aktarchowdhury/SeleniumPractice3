package com.aktar.sele;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.testng.annotations.AfterClass;

public class HomeWork1 {
@BeforeClass
public static void OpenBrowser(){
	System.out.println("Browser opens");
}
@Before
public void LogIn(){
	System.out.println("log in to facebook");
}
@Test
public void HomePage(){
	System.out.println("HomePage tested");
}
@Test
public void LinkPage(){
	System.out.println("Link page tested");
}
@After
public void TestDone(){
	System.out.println("All tests are done");
}
@AfterClass
public static void BrowserClose(){
	System.out.println("Browser closed");
}
}
