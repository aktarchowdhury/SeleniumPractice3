package com.aktar.selen;

import org.junit.Test;

public class TestClass2 extends BaseClass1{
	@Test
	public void TestStarts2(){
	obj.click("SignonForm");
	obj.clickAt("username","aktar");
	obj.clickAt("pwd", "aa4567");
	obj.check("rememberuserid");
	obj.click("find-submit");
	

	
	
	
	

	}

}