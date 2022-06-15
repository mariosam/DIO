/** 
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ mvn clean test -Dtest=your.package.TestClassName
 */ 
package JAVA;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class QuemPagaraContaTest {

	@Test
	public void testQuemPagaraConta() throws Exception {
		//Test 1
		int[] want = {1, 1, 1, 0};
		int[] got = QuemPagaraConta.resultOfSum( new int[] {3, 11, 7, 18} );
        assertArrayEquals(want, got);
		//Test 2
		want = new int[] {1, 1, 1, 1, 1, 1, 1, 1};
		got = QuemPagaraConta.resultOfSum( new int[] {7, 1, 1, 3, 3, 1, 7, 99} );
        assertArrayEquals(want, got);
		//Test 3
		want = new int[] {0, 0, 0, 0, 0, 0, 0};
		got = QuemPagaraConta.resultOfSum( new int[] {6, 2, 2, 4, 8, 10, 128} );
        assertArrayEquals(want, got);
	}

}
