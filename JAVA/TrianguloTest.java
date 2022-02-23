/** 
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ mvn clean test -Dtest=your.package.TestClassName
 */ 
package JAVA;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TrianguloTest  {

	@Test
	public void testTriangulo() throws Exception {
		//Test 1
		String want = "Area = 10.0";
		String got = Triangulo.calcArea(6.0, 4.0, 2.0);
		assertEquals(want, got);
		//Test 2
		want = "Perimetro = 12.1";
		got = Triangulo.calcArea(6.0, 4.0, 2.1);
		assertEquals(want, got);
	}

}
