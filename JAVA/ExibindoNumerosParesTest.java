/** 
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ mvn clean test -Dtest=your.package.TestClassName
 */ 
package JAVA;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class ExibindoNumerosParesTest {

	@Test
	public void testExibindoNumerosPares() throws Exception {
		//Test 1
		int[] want = {2, 4, 6};
		int[] got = ExibindoNumerosPares.countEve( 6 );
        assertArrayEquals(want, got);
		//Test 2
		want = new int[] {2, 4, 6, 8, 10, 12};
		got = ExibindoNumerosPares.countEve( 13 );
        assertArrayEquals(want, got);
	}

}
