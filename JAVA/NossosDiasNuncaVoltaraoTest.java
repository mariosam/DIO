/** 
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ mvn clean test -Dtest=your.package.TestClassName
 */ 
package JAVA;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class NossosDiasNuncaVoltaraoTest {

	@Test
	public void testNossosDiasNuncaVoltarao() throws Exception {
		//Test 1
		String want = "L";
		String got = NossosDiasNuncaVoltarao.cutWord(1);
		assertEquals(want, got);
		//Test 2
		want = "LIF";
		got = NossosDiasNuncaVoltarao.cutWord(3);
		assertEquals(want, got);
		//Test 3
		want = "LIFE IS";
		got = NossosDiasNuncaVoltarao.cutWord(7);
		assertEquals(want, got);
	}

}
