package com.aktar.sele1;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;

import com.thoughtworks.selenium.DefaultSelenium;

public class HomeWork1 {
DefaultSelenium key=new DefaultSelenium("localhost",4444,"firefox","https://www.facebook.com/");
@Before
public void BrowserOpen(){
key.start();
key.open("/");
key.setSpeed("3000");
key.windowMaximize();
}
@After
public void TestDone(){
	//key.stop();
	//key.close();
	}
}