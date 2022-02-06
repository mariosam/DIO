/** 
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ mvn clean test -Dtest=your.package.TestClassName
 */ 
package JAVA;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FatorialSimplesTest {

	@Test
	public void testFatorialSimples() throws Exception {
		//Test 1
		int want = 24;
		int got = FatorialSimples.simpleFactorial(4);
		assertEquals(want, got);
		//Test 2
		want = 720;
		got = FatorialSimples.simpleFactorial(6);
		assertEquals(want, got);
		//Test 3
		want = 1;
		got = FatorialSimples.simpleFactorial(1);
		assertEquals(want, got);
	}

}
