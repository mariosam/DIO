/** 
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ mvn clean test -Dtest=your.package.TestClassName
 */ 
package JAVA;

import org.junit.Assert;
import org.junit.Test;

public class CoxinhaDeBuenoTest {

	@Test
	public void testCoxinhaDeBueno() throws Exception {
		//Test 1
		String want = "0.11";
		String got = CoxinhaDeBueno.calcCoxinha(10, 90);
        Assert.assertEquals(want, got);
		//Test 2
		want = "76.36";
		got = CoxinhaDeBueno.calcCoxinha(840, 11);
		Assert.assertEquals(want, got);
		//Test 3
		want = "0.02";
		got = CoxinhaDeBueno.calcCoxinha(1, 50);
		Assert.assertEquals(want, got);
		//Test 4
		want = "0.10";
		got = CoxinhaDeBueno.calcCoxinha(9, 90);
		Assert.assertEquals(want, got);
	}

}
