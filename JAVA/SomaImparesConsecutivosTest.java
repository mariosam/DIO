/** 
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ mvn clean test -Dtest=your.package.TestClassName
 */ 
package JAVA;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SomaImparesConsecutivosTest {

	@Test
	public void testSomaImparesConsecutivos() throws Exception {
		//Test 1
		int want = 5;
		int got = SomaImparesConsecutivos.oddsBetween(6, -5);
		assertEquals(want, got);
		//Test 2
		want = 13;
		got = SomaImparesConsecutivos.oddsBetween(15, 12);
		assertEquals(want, got);
		//Test 3
		want = 0;
		got = SomaImparesConsecutivos.oddsBetween(12, 12);
		assertEquals(want, got);
		//Test 4
		want = 3;
		got = SomaImparesConsecutivos.oddsBetween(1, 5);
		assertEquals(want, got);
	}

}
