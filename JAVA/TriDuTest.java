/** 
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ mvn clean test -Dtest=your.package.TestClassName
 */ 
package JAVA;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TriDuTest {

	@Test
	public void testTriDu() throws Exception {
		//Test 1
		int want = 10;
		int got = TriDu.greatestCard(10, 7);
		assertEquals(want, got);
		//Test 2
		want = 2;
		got = TriDu.greatestCard(2, 2);
		assertEquals(want, got);
	}
}
