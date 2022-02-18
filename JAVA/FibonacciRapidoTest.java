/** 
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ mvn clean test -Dtest=your.package.TestClassName
 */ 
package JAVA;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FibonacciRapidoTest {

	@Test
	public void testFibonacciRapido() throws Exception {
		//Test 1
		double want = 1.0;
		double got = FibonacciRapido.binetFormule(1);
		assertEquals(want, got, 0.01);
		//Test 2
		want = 1.0;
		got = FibonacciRapido.binetFormule(2);
		assertEquals(want, got, 0.01);
		//Test 3
		want = 2.0;
		got = FibonacciRapido.binetFormule(3);
		assertEquals(want, got, 0.01);
		//Test 4
		want = 4181.0;
		got = FibonacciRapido.binetFormule(19);
		assertEquals(want, got, 0.01);
	}

}
