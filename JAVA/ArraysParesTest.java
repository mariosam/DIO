/** 
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ mvn clean test -Dtest=your.package.TestClassName
 */ 
package JAVA;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class ArraysParesTest {

	@Test
	public void testArraysPares() throws Exception {
		//Test 1
		int[] want = {2, 18, 34};
		int[] got = ArraysPares.returnOnlyEven( new int[] {2, 3, 5, 7, 11, 13, 18, 34} );
        assertArrayEquals(want, got);
	}

}
