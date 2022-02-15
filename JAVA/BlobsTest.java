/** 
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ mvn clean test -Dtest=your.package.TestClassName
 */ 
package JAVA;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BlobsTest {

	@Test
	public void testBlobs() throws Exception {
		//Test 1
		int want = 6;
		int got = Blobs.countDays(40.0);
		assertEquals(want, got);
		//Test 2
		want = 8;
		got = Blobs.countDays(200.0);
		assertEquals(want, got);
		//Test 3
		want = 9;
		got = Blobs.countDays(300.0);
		assertEquals(want, got);
	}

}
