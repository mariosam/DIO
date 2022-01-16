/** 
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ mvn clean test -Dtest=your.package.TestClassName
 */
package JAVA;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FusoHorarioTest {

    @Test
	public void testFusoHorario() throws Exception {
		//Test 1
		int want = 20;
		int got = FusoHorario.localTime(10, 7, 3);
		assertEquals(want, got);
		//Test 2
		want = 2;
		got = FusoHorario.localTime(22, 6, -2);
		assertEquals(want, got);
		//Test 3
		want = 23;
		got = FusoHorario.localTime(0, 3, -4);
		assertEquals(want, got);
	}
}
