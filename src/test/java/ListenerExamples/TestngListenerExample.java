package ListenerExamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestngListenerExample {
  @Test
  public void test1()
  {
	  Assert.assertTrue(true);
  }
  
  @Test
  public void test2()
  {
	  Assert.assertTrue(false);
  }
  
  @Test(dependsOnMethods = "test2")
  public void test3()
  {
	  Assert.assertTrue(true);
  }
}
