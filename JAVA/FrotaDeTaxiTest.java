/** 
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ mvn clean test -Dtest=your.package.TestClassName
 */ 
package JAVA;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FrotaDeTaxiTest  {

	@Test
	public void testFrotaDeTaxi() throws Exception {
		//Test 1
		String want = "A";
		String got = FrotaDeTaxi.moreEconomic(1.20, 2.30, 10.00, 15.00);
		assertEquals(want, got);
		//Test 2
		want = "G";
		got = FrotaDeTaxi.moreEconomic(1.00, 1.00, 9.00, 9.01);
		assertEquals(want, got);
		//Test 3
		want = "G";
		got = FrotaDeTaxi.moreEconomic(1.00, 1.00, 11.00, 11.00);
		assertEquals(want, got);
	}

}
