/** 
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ mvn clean test -Dtest=your.package.TestClassName
 */ 
package JAVA;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SomaDeNumerosNaturaisTest {

	@Test
	public void testSomaDeNumerosNaturais() throws Exception {
		//Test 1
		int want = 15;
		int got = SomaDeNumerosNaturais.sumAllNaturals(1, 5);
		assertEquals(want, got);
		//Test 2
		want = 500500;
		got = SomaDeNumerosNaturais.sumAllNaturals(1, 1000);
		assertEquals(want, got);
	}

}
