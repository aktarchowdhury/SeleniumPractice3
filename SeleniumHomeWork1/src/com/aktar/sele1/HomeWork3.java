package com.aktar.sele1;

import org.junit.Test;

public class HomeWork3 extends HomeWork1 {
@Test
public void Registration(){
key.type("u_0_1", "aktar");
key.type("u_0_3", "chowdhury");
key.type("u_0_5","aktarchowdhury7@gmail.com");
key.type("u_0_8", "aktarchowdhury7@gmail.com");
key.type("u_0_a", "aa786786");
key.type("month", "7");
key.type("day", "31");
key.type("year", "1961");
key.clickAt("u_0_e", "2");
key.click("u_0_i");

}
}
