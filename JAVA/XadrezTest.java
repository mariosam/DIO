/** 
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ mvn clean test -Dtest=your.package.TestClassName
 */ 
package JAVA;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class XadrezTest {

	@Test
	public void testTableColor() throws Exception {
		//Test 1
		int want = 1;
		int got = Xadrez.tableColor(8, 8);
		assertEquals(want, got);
		//Test 2
		want = 1;
		got = Xadrez.tableColor(5, 91);
		assertEquals(want, got);
		//Test 3
		want = 0;
		got = Xadrez.tableColor(6, 9);
		assertEquals(want, got);
	}

}
