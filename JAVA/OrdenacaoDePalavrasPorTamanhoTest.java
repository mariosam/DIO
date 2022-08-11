/** 
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ mvn clean test -Dtest=your.package.TestClassName
 */ 
package JAVA;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class OrdenacaoDePalavrasPorTamanhoTest {

	@Test
	public void testOrdenacaoDePalavrasPorTamanho() throws Exception {
		//Test 1
		String want = "midnight three four mond One at";
		String got = OrdenacaoDePalavrasPorTamanho.orderWordsBySize("One three four mond at midnight");
		assertEquals(want, got);
		//Test 2
		want = "three five one";
		got = OrdenacaoDePalavrasPorTamanho.orderWordsBySize("one three five");
		assertEquals(want, got);
	}

}
