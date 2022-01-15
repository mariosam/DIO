/** 
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ mvn clean test -Dtest=your.package.TestClassName
 */ 
package JAVA;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ParOuImparTest {

	@Test
	public void testParOuImpar() throws Exception {
		//Test 1
		String want = "ODD NEGATIVE";
		String got = ParOuImpar.typeNumberMsg(-5);
		assertEquals(want, got);
		//Test 2
		want = "NULL";
		got = ParOuImpar.typeNumberMsg(0);
		assertEquals(want, got);
		//Test 3
		want = "ODD POSITIVE";
		got = ParOuImpar.typeNumberMsg(3);
		assertEquals(want, got);
		//Test 4
		want = "EVEN NEGATIVE";
		got = ParOuImpar.typeNumberMsg(-4);
		assertEquals(want, got);
	}

}
