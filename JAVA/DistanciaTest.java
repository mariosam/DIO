/** 
 * @version JAVA 1.8
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ mvn clean test -Dtest=your.package.TestClassName
 */ 
package JAVA;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DistanciaTest {

	@Test
	public void testDistancia() throws Exception {
        //Test 1
        int want = 60;
        int got = Distancia.reportMinutes(30, 2);
        assertEquals(want, got);
        //Test 2
        want = 220;
        got = Distancia.reportMinutes(110, 2);
        assertEquals(want, got);
	}

}
