/** 
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ mvn clean test -Dtest=your.package.TestClassName
 */ 
package JAVA;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DiferencaTest {

	@Test
	public void testDiferenca() throws Exception {
		//Test 1
		int want = -26;
		int got = Diferenca.showDifference(5, 6, 7, 8);
		assertEquals(want, got);
		//Test 2
		want = -56;
		got = Diferenca.showDifference(0, 0, 7, 8);
		assertEquals(want, got);
		//Test 3
		want = 86;
		got = Diferenca.showDifference(5, 6, -7, 8);
		assertEquals(want, got);
	}

}
