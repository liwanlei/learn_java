package com.jinjie;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterTest;
public class NewTest {
  @Test
  public void f() {
	  Ifstudy beijing = new Ifstudy();
	  String result=beijing.ifpanduan(20);
	  assertEquals(result, "beijing");
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
