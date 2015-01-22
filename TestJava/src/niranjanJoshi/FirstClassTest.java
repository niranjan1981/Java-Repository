package niranjanJoshi;

import static org.junit.Assert.*;

import org.junit.Test;
import org.testng.asserts.*;
public class FirstClassTest {

	@Test
	public void test() {
		FirstClass tester = new FirstClass();
		assertEquals("10 x 5 must give the value 50" , 50, tester.multiply(10, 5));
	}

}
