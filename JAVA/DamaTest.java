/** 
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ mvn clean test -Dtest=your.package.TestClassName
 */
package JAVA;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DamaTest {

  @Test
	public void testMinMoviments() throws Exception {
		//Test 1
		int want = 1;
		int got = Dama.minMoviments(4, 4, 6, 2);
		assertEquals(want, got);
		//Test 2
		want = 0;
		got = Dama.minMoviments(3, 5, 3, 5);
		assertEquals(want, got);
		//Test 3
		want = 2;
		got = Dama.minMoviments(5, 5, 4, 3);
		assertEquals(want, got);
	}
}
