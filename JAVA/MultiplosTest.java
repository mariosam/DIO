/** 
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ mvn clean test -Dtest=your.package.TestClassName
 */ 
package JAVA;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MultiplosTest {

	@Test
	public void testMultiplos() throws Exception {
		//Test 1
		String want = "Sao Multiplos";
		String got = Multiplos.areTheyMulti(6, 24);
		assertEquals(want, got);
		//Test 2
		want = "Nao sao Multiplos";
		got = Multiplos.areTheyMulti(6, 25);
		assertEquals(want, got);
	}

}
