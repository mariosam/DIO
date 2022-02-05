/** 
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ mvn clean test -Dtest=your.package.TestClassName
 */ 
package JAVA;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ColchaoTest {

	@Test
	public void testColchao() throws Exception {
		//Test 1
		String want = "S";
		String got = Colchao.checkSize(25, 120, 220, 200, 100);
		assertEquals(want, got);
		//Test 2
		want = "N";
		got = Colchao.checkSize(25, 205, 220, 200, 100);
		assertEquals(want, got);
		//Test 3
		want = "S";
		got = Colchao.checkSize(25, 200, 220, 200, 100);
		assertEquals(want, got);
	}

}
