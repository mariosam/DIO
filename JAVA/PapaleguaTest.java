/** 
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ mvn clean test -Dtest=your.package.TestClassName
 */ 
package JAVA;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class PapaleguaTest {

	@Test
	public void testPapalegua() throws Exception {
		//Test 1
		double want = 9.71;
        ArrayList<Double> ops = new ArrayList<>();
        ops.add((double) 9.81);
        ops.add((double) 9.71);
		double got = Papalegua.theFaster( ops );
        assertEquals(want, got, 0.01);
		//Test 2
		want = 9.72;
        ops = new ArrayList<>();
        ops.add((double) 9.82);
        ops.add((double) 9.72);
        ops.add((double) 9.92);
        got = Papalegua.theFaster( ops );
        assertEquals(want, got, 0.01);
	}

}
