/** 
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ mvn clean test -Dtest=your.package.TestClassName
 */ 
package JAVA;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class NotasDaProvaTest {

	@Test
	public void testNotasDaProvaTest() throws Exception {
		//Test 1
		String want = "D";
		String got = NotasDaProva.takeResult(12);
		assertEquals(want, got);
		//Test 2
		want = "A";
		got = NotasDaProva.takeResult(87);
		assertEquals(want, got);
		//Test 3
		want = "E";
		got = NotasDaProva.takeResult(0);
		assertEquals(want, got);
	}

}
