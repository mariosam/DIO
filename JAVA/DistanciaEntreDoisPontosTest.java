/** 
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ mvn clean test -Dtest=your.package.TestClassName
 */ 
package JAVA;

import org.junit.Assert;
import org.junit.Test;

public class DistanciaEntreDoisPontosTest {

	@Test
	public void testDistanciaEntreDoisPontos() throws Exception {
		//Test 1
		String want = "4.4721";
		String got = DistanciaEntreDoisPontos.getDistance(1.0f, 7.0f, 5.0f, 9.0f);
        Assert.assertEquals(want, got);
		//Test 2
		want = "16.1484";
		got = DistanciaEntreDoisPontos.getDistance(-2.5f, 0.4f, 12.1f, 7.3f);
		Assert.assertEquals(want, got);
		//Test 3
		want = "16.4575";
		got = DistanciaEntreDoisPontos.getDistance(2.5f, -0.4f, -12.2f, 7.0f);
		Assert.assertEquals(want, got);
	}

}
