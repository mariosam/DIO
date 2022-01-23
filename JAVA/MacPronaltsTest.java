/** 
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ mvn clean test -Dtest=your.package.TestClassName
 */ 
package JAVA;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MacPronaltsTest {

	@Test
	public void testMacPronalts() throws Exception {
		//Test 1
		double want = 19.50;
		double got = MacPronalts.shopValue(new int[]{1001, 1005}, new int[]{2, 3});
		assertEquals(want, got, 0.01);
		//Test 2
		want = 1750.00;
		got = MacPronalts.shopValue(new int[]{1003}, new int[]{500});
		assertEquals(want, got, 0.01);
		//Test 3
		want = 2808.50;
		got = MacPronalts.shopValue(new int[]{1001, 1005, 1003, 1002, 1004}, new int[]{500, 300, 23, 52, 44});
		assertEquals(want, got, 0.01);
	}

}
