/** 
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ mvn clean test -Dtest=your.package.TestClassName
 */ 
package JAVA;

import org.junit.Assert;
import org.junit.Test;

public class DDDTest {

	@Test
	public void testDDD() throws Exception {
		//Test 1
		String want = "Sao Paulo";
		String got = DDD.dddCity(11);
    Assert.assertEquals(want, got);
		//Test 2
		want = "DDD nao cadastrado";
		got = DDD.dddCity(13);
		Assert.assertEquals(want, got);
	}

}
