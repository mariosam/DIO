/** 
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ mvn clean test -Dtest=your.package.TestClassName
 */ 
package JAVA;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class GuilhermeSuasPipasTest {

	@Test
	public void testGuilhermeSuasPipas() throws Exception {
		//Test 1
		int want = 2;
		int got = GuilhermeSuasPipas.numberOfTwine(4);
		assertEquals(want, got);
		//Test 2
		want = 35;
		got = GuilhermeSuasPipas.numberOfTwine(10);
		assertEquals(want, got);
		//Test 3
		want = 44;
		got = GuilhermeSuasPipas.numberOfTwine(11);
		assertEquals(want, got);
	}

}
