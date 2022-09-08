/** 
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ mvn clean test -Dtest=your.package.TestClassName
 */ 
package JAVA;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculoSimplesTest {

	@Test
	public void testCalculoSimples() throws Exception {
		//Test 1
		double want = 15.50;
		double got = CalculoSimples.calcTotalToPay(new double[]{12, 1, 5.30}, new double[]{16, 2, 5.10});
		assertEquals(want, got, 0.01);
		//Test 2
		want = 51.40;
		got = CalculoSimples.calcTotalToPay(new double[]{13, 2, 15.30}, new double[]{161, 4, 5.20});
		assertEquals(want, got, 0.01);
		//Test 3
		want = 30.20;
		got = CalculoSimples.calcTotalToPay(new double[]{1, 1, 15.10}, new double[]{2, 1, 15.10});
		assertEquals(want, got, 0.01);
	}

}
