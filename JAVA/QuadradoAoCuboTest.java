/** 
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ mvn clean test -Dtest=your.package.TestClassName
 */ 
package JAVA;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class QuadradoAoCuboTest {

	@Test
	public void testQuadradoAoCubo() throws Exception {
		//Test 1
		int[][] want = {{1,1,1}, {2,4,8}, {3,9,27}, {4,16,64}, {5,25,125}};
		int[][] got = QuadradoAoCubo.loadSquareAndCumbe( 5 );
        assertArrayEquals(want, got);
	}

}
