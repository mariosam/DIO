/** 
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ mvn clean test -Dtest=your.package.TestClassName
 */ 
package JAVA;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class AnaliseDeNumerosTest {

  @Test
	public void testAnaliseDeNumeros() throws Exception {
        //Test 1
        int[] want = {3, 2, 1, 3};
        int[] ops = {-5, 0, -3, -4, 12};
        int[] got = AnaliseDeNumeros.numberAnalysis( ops );
        assertArrayEquals(want, got);
	}

}
