package java20;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test4 {
  @Test
  public void testAssert1() {
	  System.out.println("开始断言");
	  Assert.assertEquals("1","1");
	  System.out.println("结束断言");
  }
  @Test
  public void testAssert2() {
	  System.out.println("开始断言");
	  Assert.assertEquals(1,2,"比较两个数字是否相等");
	  System.out.println("结束断言");
  }
}
