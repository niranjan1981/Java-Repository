package NiranjanJoshi.NiranjanClass;

import org.testng.*;
import org.testng.annotations.*;

public class FireFoxTestOneTest {

	
		@Test
		public void test1() {
			Assert.assertEquals(FirefoxTestOne.getTitle(),"Wikipedia");
		}
		

	

}
