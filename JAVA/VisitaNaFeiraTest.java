/** 
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ mvn clean test -Dtest=your.package.TestClassName
 */ 
package JAVA;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class VisitaNaFeiraTest {

	@Test
	public void testVisitaNaFeira() throws Exception {
		//Test 1
		int want = 18;
		int got = VisitaNaFeira.totalPeppers(11, 7);
		assertEquals(want, got);
		//Test 2
		want = -5;
		got = VisitaNaFeira.totalPeppers(-11, 6);
		assertEquals(want, got);
		//Test 3
		want = 9;
		got = VisitaNaFeira.totalPeppers(11, -2);
		assertEquals(want, got);
	}

}
