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
  @Test
  public void be() {
	  Ifstudy beijing = new Ifstudy();
	  String result=beijing.ifpanduan(5);
	  assertEquals(result, "beijing");
  }
  @Test
  public void bee() {
	  Ifstudy beijing = new Ifstudy();
	  String result=beijing.ifpanduan(3);
	  assertEquals(result, "shanghai");
  }
  @Test
  public void bsse() {
	  Ifstudy beijing = new Ifstudy();
	  String result=beijing.ifpanduan(-1);
	  assertEquals(result, "shenzhen");
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
