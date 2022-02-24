/** 
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ mvn clean test -Dtest=your.package.TestClassName
 */ 
package JAVA;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TriangulosPoligonosRegularesTest {

	@Test
	public void testTriangulosPoligonosRegulares() throws Exception {
		//Test 1
		int want = 1;
		int got = TriangulosPoligonosRegulares.minTriangules(3);
		assertEquals(want, got);
		//Test 2
		want = 2;
		got = TriangulosPoligonosRegulares.minTriangules(4);
		assertEquals(want, got);
		//Test 3
		want = 3;
		got = TriangulosPoligonosRegulares.minTriangules(5);
		assertEquals(want, got);
	}

}
