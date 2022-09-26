/** 
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ mvn clean test -Dtest=your.package.TestClassName
 */
package JAVA;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RoboTest {

    @Test
	public void testRobo() throws Exception {
		//Test 1
		boolean want = true;
		boolean got = Robo.originPosition("WS");
		assertEquals(want, got);
		//Test 2
		want = false;
		got = Robo.originPosition("AA");
		assertEquals(want, got);
	}
}
