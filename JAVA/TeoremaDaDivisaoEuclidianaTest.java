/** 
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ mvn clean test -Dtest=your.package.TestClassName
 */ 
package JAVA;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class TeoremaDaDivisaoEuclidianaTest {

	@Test
	public void testTeoremaDaDivisaoEuclidiana() throws Exception {
		//Test 1
		int[] want = {2, 1};
		int[] got = TeoremaDaDivisaoEuclidiana.getQuoAndRest( 7, 3 );
        assertArrayEquals(want, got);
		//Test 2
		want = new int[] {-2, 1};
		got = TeoremaDaDivisaoEuclidiana.getQuoAndRest( 7, -3 );
        assertArrayEquals(want, got);
		//Test 3
		want = new int[] {3, 2};
		got = TeoremaDaDivisaoEuclidiana.getQuoAndRest( -7, -3 );
        assertArrayEquals(want, got);
	}

}
