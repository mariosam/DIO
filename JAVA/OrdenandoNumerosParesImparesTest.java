/** 
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ mvn clean test -Dtest=your.package.TestClassName
 */ 
package JAVA;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class OrdenandoNumerosParesImparesTest {

	@Test
	public void testOrdenandoNumerosParesImpares() throws Exception {
		//Test 1
		int[] want = {4, 32, 34, 98, 654, 3456, 6789, 567, 543, 87};
		int[] got = OrdenandoNumerosParesImpares.orderOddsEvenNumbers( new int[] {4, 32, 34, 543, 3456, 654, 567, 87, 6789, 98} );
        assertArrayEquals(want, got);
		//Test 2
		want = new int[] {6, 10, 7, 5};
		got = OrdenandoNumerosParesImpares.orderOddsEvenNumbers( new int[] {10, 5, 6, 7} );
        assertArrayEquals(want, got);
	}

}
