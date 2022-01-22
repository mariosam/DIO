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

public class QuantidadeNumerosPositivosTest {

	@Test
	public void testQuantidadeNumerosPositivos() throws Exception {
		//Test 1
		int want = 4;
    ArrayList<Double> ops = new ArrayList<>();
    ops.add((double) 7);
    ops.add((double) -5);
    ops.add((double) 6);
    ops.add(-3.4);
    ops.add(4.6);
    ops.add((double) 12);
		int got = QuantidadeNumerosPositivos.sumPositives( ops );
    //int got = QuantidadeNumerosPositivos.sumPositives(new double[] {7, -5, 6, -3.4, 4.6, 12});
		assertEquals(want, got);
		//Test 2
		want = 6;
    ops = new ArrayList<>();
    ops.add((double) 70);
    ops.add((double) 67);
    ops.add((double) 77);
    ops.add((double) 99);
    ops.add((double) 23);
    ops.add((double) 1);
    got = QuantidadeNumerosPositivos.sumPositives( ops );
		//got = QuantidadeNumerosPositivos.sumPositives(new double[] {70, 67, 77, 99, 23, 1});
		assertEquals(want, got);
	}

}
