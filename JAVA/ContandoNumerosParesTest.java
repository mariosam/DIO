/** 
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ mvn clean test -Dtest=your.package.TestClassName
 */ 
package JAVA;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ContandoNumerosParesTest {

	@Test
	public void testContandoNumerosPares() throws Exception {
		//Test 1
		int want = 2;
		int got = ContandoNumerosPares.countEven(4);
		assertEquals(want, got);
		//Test 2
		want = 14;
		got = ContandoNumerosPares.countEven(30);
		assertEquals(want, got);
	}

}
