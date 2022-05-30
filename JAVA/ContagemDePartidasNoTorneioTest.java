/** 
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ mvn clean test -Dtest=your.package.TestClassName
 */ 
package JAVA;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ContagemDePartidasNoTorneioTest {

	@Test
	public void testContagemDePartidasNoTorneio() throws Exception {
		//Test 1
		int want = 6;
		int got = ContagemDePartidasNoTorneio.numberOfGames(7);
		assertEquals(want, got);
		//Test 2
		want = 13;
		got = ContagemDePartidasNoTorneio.numberOfGames(14);
		assertEquals(want, got);
	}

}
