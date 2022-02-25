/** 
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ mvn clean test -Dtest=your.package.TestClassName
 */ 
package JAVA;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TesteDeSelecao1Test {

	@Test
	public void testTesteDeSelecao1() throws Exception {
		//Test 1
		String want = "Valores nao aceitos";
		String got = TesteDeSelecao1.checkSequence(5, 6, 7, 8);
		assertEquals(want, got);
		//Test 2
		want = "Valores aceitos";
		got = TesteDeSelecao1.checkSequence(2, 3, 2, 6);
		assertEquals(want, got);
	}

}
