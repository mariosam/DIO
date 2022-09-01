/** 
 * @version JAVA 1.8
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ mvn clean test -Dtest=your.package.TestClassName
 */ 
package JAVA;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class PinkCerebroTest {

	@Test
	public void testPinkCerebro() throws Exception {
		//Test 1
		int[] want = {4, 0, 2, 3};
		int[] got = PinkCerebro.getMultiples( new int[]{2, 5, 4, 20, 10} );
        assertArrayEquals(want, got);
		//Test 2
		want = new int[] {1, 0, 1, 1};
		got = PinkCerebro.getMultiples( new int[]{100} );
        assertArrayEquals(want, got);
		//Test 3
		want = new int[] {1, 1, 1, 1};
		got = PinkCerebro.getMultiples( new int[]{3, 4, 5} );
        assertArrayEquals(want, got);
	}

}
