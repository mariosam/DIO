/** 
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ mvn clean test -Dtest=your.package.TestClassName
 */ 
package JAVA;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FilaDoBancoTest {

	@Test
	public void testFilaDoBanco() throws Exception {
		//Test 1
		int want = 1;
        int got = FilaDoBanco.changingPlaces(new Integer[] {100, 80, 90});
		assertEquals(want, got);
		//Test 2
		want = 0;
		got = FilaDoBanco.changingPlaces(new Integer[] {100, 120, 30, 50});
		assertEquals(want, got);
		//Test 3
		want = 4;
		got = FilaDoBanco.changingPlaces(new Integer[] {100, 90, 30, 25});
		assertEquals(want, got);
	}

}
