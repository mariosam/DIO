/** 
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ mvn clean test -Dtest=your.package.TestClassName
 */ 
package JAVA;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AndandoNoTempoTest {

	@Test
	public void testAndandoNoTempo() throws Exception {
		//Test 1
		String want = "S";
		String got = AndandoNoTempo.possibleTravel(22, 5, 22);
		assertEquals(want, got);
		//Test 2
		want = "S";
		got = AndandoNoTempo.possibleTravel(31, 110, 79);
		assertEquals(want, got);
		//Test 3
		want = "N";
		got = AndandoNoTempo.possibleTravel(45, 8, 7);
		assertEquals(want, got);
	}

}
