package niranjanJoshi;

import static org.junit.Assert.assertEquals;

import org.testng.annotations.Test;

public class NewTest {
	@Test
  public void f() {
	  FirstClass tester = new FirstClass();
		assertEquals("10 x 5 must give the value 50" , 50, tester.multiply(10, 5));
  }
}
