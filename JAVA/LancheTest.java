/** 
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ mvn clean test -Dtest=your.package.TestClassName
 */ 
package JAVA;

import org.junit.Assert;
import org.junit.Test;

public class LancheTest {

	@Test
	public void testLanche() throws Exception {
		//Test 1
		float want = (float) 10.00;
		float got = Lanche.totalToPay(3, 2);
    Assert.assertEquals(want, got, 0.2f);
		//Test 2
		want = (float) 6.00;
		got = Lanche.totalToPay(4, 3);
		Assert.assertEquals(want, got, 0.2f);
		//Test 3
		want = (float) 13.50;
		got = Lanche.totalToPay(2, 3);
		Assert.assertEquals(want, got, 0.2f);
	}

}
