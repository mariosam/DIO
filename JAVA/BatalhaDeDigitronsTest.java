/** 
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ mvn clean test -Dtest=your.package.TestClassName
 */ 
package JAVA;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BatalhaDeDigitronsTest {

	@Test
	public void testBatalhaDeDigitrons() throws Exception {
		//Test 1
		String want = "Guarte";
		String got = BatalhaDeDigitrons.winnerBattle(5, new int[]{12, 23, 15}, new int[]{42, 12, 20});
		assertEquals(want, got);
		//Test 2
		want = "Empate";
		got = BatalhaDeDigitrons.winnerBattle(2, new int[]{52, 1, 11}, new int[]{1, 52, 1});
		assertEquals(want, got);
		//Test 3
		want = "Bruno";
		got = BatalhaDeDigitrons.winnerBattle(3, new int[]{95, 12, 22}, new int[]{5, 51, 21});
		assertEquals(want, got);
	}

}
