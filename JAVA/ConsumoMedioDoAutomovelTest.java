/** 
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ mvn clean test -Dtest=your.package.TestClassName
 */ 
package JAVA;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ConsumoMedioDoAutomovelTest  {

	@Test
	public void testConsumoMedioDoAutomovel() throws Exception {
		//Test 1
		double want = 14.286;
		double got = ConsumoMedioDoAutomovel.averageConsumption(500, 35.0);
		assertEquals(want, got, 0.03);
		//Test 2
		want = 18.119;
		got = ConsumoMedioDoAutomovel.averageConsumption(2254, 124.4);
		assertEquals(want, got, 0.03);
		//Test 3
		want = 9.802;
		got = ConsumoMedioDoAutomovel.averageConsumption(4554, 464.6);
		assertEquals(want, got, 0.03);
	}

}
