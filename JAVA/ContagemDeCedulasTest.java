/** 
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ mvn clean test -Dtest=your.package.TestClassName
 */ 
package JAVA;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class ContagemDeCedulasTest {

	@Test
	public void testContagemDeCedulas() throws Exception {
        //Test 1
        int[] want = {5, 1, 1, 0, 1, 0, 1};
        int[] got = ContagemDeCedulas.countNotes( 576 );
        assertArrayEquals(want, got);
        //Test 2
        want = new int[] {112, 1, 0, 0, 1, 1, 0};
        got = ContagemDeCedulas.countNotes( 11257 );
        assertArrayEquals(want, got);
        //Test 3
        want = new int[] {5, 0, 0, 0, 0, 1, 1};
        got = ContagemDeCedulas.countNotes( 503 );
        assertArrayEquals(want, got);
	}

}
