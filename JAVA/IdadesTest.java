/** 
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ mvn clean test -Dtest=your.package.TestClassName
 */ 
package JAVA;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class IdadesTest  {

	@Test
	public void testIdades() throws Exception {
		//Test 1
		double want = 39.25;
        int[] ages = {34, 56, 44, 23};
		double got = Idades.calcAverage( ages );
		assertEquals(want, got, 0.01);
		//Test 2
		want = 28.60;
        ages = new int[] {28, 17, 41, 23, 34};
		got = Idades.calcAverage( ages );
		assertEquals(want, got, 0.01);
		//Test 3
		want = 38.25;
        ages = new int[] {24, 29, 48, 52};
		got = Idades.calcAverage( ages );
		assertEquals(want, got, 0.01);
		//Test 4
		want = 28.00;
        ages = new int[] {10, 2, 6, 54, 22, 89, 16, 25};
		got = Idades.calcAverage( ages );
		assertEquals(want, got, 0.01);
	}

}
