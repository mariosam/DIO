/** 
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ mvn clean test -Dtest=your.package.TestClassName
 */ 
package JAVA;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TopNTest {

	@Test
	public void testTopN() throws Exception {
		//Test 1
		String want = "Top 10";
		String got = TopN.topRange(7);
		assertEquals(want, got);
		//Test 2
		want = "Top 25";
		got = TopN.topRange(25);
		assertEquals(want, got);
		//Test 3
		want = "Top 50";
		got = TopN.topRange(26);
		assertEquals(want, got);
	}

}
