/** 
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ mvn clean test -Dtest=your.package.TestClassName
 */ 
package JAVA;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SomaSimplesTest {

	@Test
	public void testSomaSimples() throws Exception {
		//Test 1
		int want = 40;
		int got = SomaSimples.simpleSum(30, 10);
		assertEquals(want, got);
		//Test 2
		want = -20;
		got = SomaSimples.simpleSum(-30, 10);
		assertEquals(want, got);
		//Test 3
		want = 0;
		got = SomaSimples.simpleSum(0, 0);
		assertEquals(want, got);
	}

}
