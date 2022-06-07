/** 
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ mvn clean test -Dtest=your.package.TestClassName
 */ 
package JAVA;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class ProibidoEntradaDeMenoresTest {
 
	@Test
	public void testProibidoEntradaDeMenores() throws Exception {
		//Test 1
		int[] want = {4, 15};
		int[] got = ProibidoEntradaDeMenores.forbidenUnder18( new int[] {4, 18, 22, 15, 50} );
        assertArrayEquals(want, got);
		//Test 2
		want = new int[] {6, 12, 17, 8};
		got = ProibidoEntradaDeMenores.forbidenUnder18( new int[] {6, 54, 12, 30, 17, 8, 24} );
        assertArrayEquals(want, got);
		//Test 3
		want = new int[] {15};
		got = ProibidoEntradaDeMenores.forbidenUnder18( new int[] {18, 22, 15, 99} );
        assertArrayEquals(want, got);
	}

}
