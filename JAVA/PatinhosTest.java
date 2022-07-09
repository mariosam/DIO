/** 
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ mvn clean test -Dtest=your.package.TestClassName
 */ 
package JAVA;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PatinhosTest {

	@Test
	public void testPatinhos() throws Exception {
		//Test 1
		int want = 0;
		int got = Patinhos.returnedDucks(0);
		assertEquals(want, got);
		//Test 2
		want = 0;
		got = Patinhos.returnedDucks(1);
		assertEquals(want, got);
		//Test 3
		want = 9;
		got = Patinhos.returnedDucks(10);
		assertEquals(want, got);
	}

}
