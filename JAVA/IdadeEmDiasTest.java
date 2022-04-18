/** 
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ mvn clean test -Dtest=your.package.TestClassName
 */ 
package JAVA;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class IdadeEmDiasTest {

	@Test
	public void testIdadeEmDias() throws Exception {
		//Test 1
		int[] want = {1, 1, 5};
		int[] got = IdadeEmDias.splitAgeDays( 400 );
        assertArrayEquals(want, got);
		//Test 2
		want = new int[] {2, 2, 10};
		got = IdadeEmDias.splitAgeDays( 800 );
        assertArrayEquals(want, got);
		//Test 3
		want = new int[] {0, 1, 0};
		got = IdadeEmDias.splitAgeDays( 30 );
        assertArrayEquals(want, got);
	}

}
