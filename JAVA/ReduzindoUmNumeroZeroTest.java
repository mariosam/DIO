/** 
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ mvn clean test -Dtest=your.package.TestClassName
 */ 
package JAVA;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ReduzindoUmNumeroZeroTest {

	@Test
	public void testReduzindoUmNumeroZero() throws Exception {
		//Test 1
		int want = 6;
		int got = ReduzindoUmNumeroZero.reduceNumber(14);
		assertEquals(want, got);
		//Test 2
		want = 4;
		got = ReduzindoUmNumeroZero.reduceNumber(8);
		assertEquals(want, got);
	}

}
