/** 
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ mvn clean test -Dtest=your.package.TestClassName
 */ 
package JAVA;

import org.junit.Assert;
import org.junit.Test;

public class DividindoXporYTest {

	@Test
	public void testDividindoXporY() throws Exception {
		//Test 1
		String want = "-1.5";
		String got = DividindoXporY.divTwoValues(3, -2);
        Assert.assertEquals(want, got);
		//Test 2
		want = "divisao impossivel";
		got = DividindoXporY.divTwoValues(-8, 0);
		Assert.assertEquals(want, got);
		//Test 3
		want = "0.0";
		got = DividindoXporY.divTwoValues(0, 8);
		Assert.assertEquals(want, got);
	}

}
