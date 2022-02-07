/** 
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ mvn clean test -Dtest=your.package.TestClassName
 */ 
package JAVA;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PneuTest {

	@Test
	public void testPneu() throws Exception {
		//Test 1
		int want = 12;
		int got = Pneu.difPression(30, 18);
		assertEquals(want, got);
		//Test 2
		want = 0;
		got = Pneu.difPression(27, 27);
		assertEquals(want, got);
		//Test 3
		want = -3;
		got = Pneu.difPression(27, 30);
		assertEquals(want, got);
	}

}
