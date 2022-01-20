/** 
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ mvn clean test -Dtest=your.package.TestClassName
 */ 
package JAVA;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MultiplicacaoSimplesTest {

	@Test
	public void testMultiplicacaoSimples() throws Exception {
		//Test 1
		int want = 27;
		int got = MultiplicacaoSimples.getMulti(3, 9);
		assertEquals(want, got);
		//Test 2
		want = -300;
		got = MultiplicacaoSimples.getMulti(-30, 10);
		assertEquals(want, got);
		//Test 3
		want = 0;
		got = MultiplicacaoSimples.getMulti(0, 9);
		assertEquals(want, got);
	}

}
