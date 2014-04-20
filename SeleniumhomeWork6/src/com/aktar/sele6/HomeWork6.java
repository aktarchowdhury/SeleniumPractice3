package com.aktar.sele6;

import com.thoughtworks.selenium.DefaultSelenium;

public class HomeWork6 {

	public static void main(String[] args) {
	DefaultSelenium test=new DefaultSelenium("localhost",4444,"firefox","https://www.adleads.com/");
test.start();
test.open("/");
test.type("first_name", "aktar");
test.type("last_name", "chowdhury");
test.type("company", "cvs");
test.type("email", "aktarchowdhury7@gmail.com");
test.type("phone", "3134443232");
test.type("companyUrl", "http://www.facebook.com");
test.clickAt("acceptpolicy", "true");
test.click("sign up");

	}

}
